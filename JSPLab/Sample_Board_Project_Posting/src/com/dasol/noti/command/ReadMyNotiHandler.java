package com.dasol.noti.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dasol.auth.service.User;
import com.dasol.mvc.command.CommandHandler;
import com.dasol.noti.service.NotiData;
import com.dasol.noti.service.ReadMyNotiService;

public class ReadMyNotiHandler implements CommandHandler {

	private ReadMyNotiService readMyNotiService = new ReadMyNotiService();
	
	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		User authUser = (User) request.getSession().getAttribute("authUser");
		
		int myId = authUser.getId();
		
		NotiData notiData = readMyNotiService.readMyNoti(myId);
		
		request.setAttribute("notiData", notiData);
		
		return "/WEB-INF/view/myNoti.jsp";
	}
	
}
