package com.dasol.member.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dasol.member.model.UserInfo;
import com.dasol.member.service.MemberNotFoundException;
import com.dasol.member.service.UserInfoService;
import com.dasol.mvc.command.CommandHandler;

public class UserInfoHandler implements CommandHandler {
	private UserInfoService service = new UserInfoService();
	
	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String user = request.getParameter("user");
		int userId = Integer.parseInt(user);
		
		try {
			UserInfo userInfo = service.selectUser(userId);
			request.setAttribute("userInfo", userInfo);
			return "/WEB-INF/view/user.jsp";
		} catch (MemberNotFoundException e) {
			response.sendError(HttpServletResponse.SC_BAD_REQUEST);
			return null;
		}
		
		
	}

}
