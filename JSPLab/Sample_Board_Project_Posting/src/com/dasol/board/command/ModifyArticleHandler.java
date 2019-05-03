package com.dasol.board.command;

import java.io.IOException;

import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dasol.auth.service.User;
import com.dasol.board.service.ArticleData;
import com.dasol.board.service.ArticleNotFoundException;
import com.dasol.board.service.ModifyArticleService;
import com.dasol.board.service.ModifyRequest;
import com.dasol.board.service.PermissionChecker;
import com.dasol.board.service.PermissionDeniedException;
import com.dasol.board.service.ReadArticleService;
import com.dasol.mvc.command.CommandHandler;


public class ModifyArticleHandler implements CommandHandler {
	
	private static final String FORM_VIEW = "/WEB-INF/board/modifyArticleForm.jsp";
	private ReadArticleService readArticleService = new ReadArticleService();
	private ModifyArticleService modifyArticleService = new ModifyArticleService();
	
	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Exception {
		if(request.getMethod().equalsIgnoreCase("GET")) {
			return processForm(request, response);
		} else if(request.getMethod().equalsIgnoreCase("POST")) {
			return processSubmit(request, response);
		} else {
			response.setStatus(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
			return null;
		}
	}

	private String processForm(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String no = request.getParameter("no");
		int articleNo = Integer.parseInt(no);
		
		ArticleData articleData = null;
		try {
			articleData = readArticleService.getArticle(articleNo, false);
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		User authUser = (User) request.getSession().getAttribute("authUser");
		if(!PermissionChecker.canDo(authUser.getId(), articleData.getArticle())) {
			response.sendError(HttpServletResponse.SC_FORBIDDEN);
			return null;
		}
		
		ModifyRequest modifyRequest = new ModifyRequest(authUser.getId(), articleData.getArticle().getNumber(), 
				articleData.getArticle().getTitle(), articleData.getArticleContent().getContent());
		
		request.setAttribute("modReq", modifyRequest);
		return FORM_VIEW;
	}

	private String processSubmit(HttpServletRequest request, HttpServletResponse response) throws Exception {
		User authUser = (User)request.getSession().getAttribute("authUser");
		String no = request.getParameter("no");
		int articleNo = Integer.parseInt(no);
		
		ModifyRequest modRequest = new ModifyRequest(authUser.getId(), 
				articleNo, 
				request.getParameter("title"), 
				request.getParameter("content"));
		try {
			modifyArticleService.modify(modRequest);
			response.sendRedirect("/board/read.do?no="+articleNo);
			return null;
		} catch (ArticleNotFoundException e) {
			response.sendError(HttpServletResponse.SC_NOT_FOUND);
			return null;
		} catch (PermissionDeniedException e) {
			response.sendError(HttpServletResponse.SC_FORBIDDEN);
			return null;
		}
	}

}
