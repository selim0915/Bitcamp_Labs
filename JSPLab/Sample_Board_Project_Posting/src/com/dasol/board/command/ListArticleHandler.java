package com.dasol.board.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dasol.board.service.ArticlePage;
import com.dasol.board.service.ListArticleService;
import com.dasol.mvc.command.CommandHandler;

public class ListArticleHandler implements CommandHandler {

	private ListArticleService listArticleService = new ListArticleService();
	
	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String pageNum = request.getParameter("page");
		String sort = request.getParameter("sort");
		
		int page = 1;
		
		if(pageNum != null) {
			page = Integer.parseInt(pageNum);
		}
		
		ArticlePage articlePage = listArticleService.getArticlePage(page, sort);
		request.setAttribute("articlePage", articlePage);
		
		return "/WEB-INF/board/listArticle.jsp";
	}

}
