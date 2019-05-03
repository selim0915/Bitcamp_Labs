package com.dasol.noti.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dasol.auth.service.User;
import com.dasol.mvc.command.CommandHandler;
import com.dasol.noti.service.DeleteMyNotiService;
import com.dasol.noti.service.ReadMyNotiService;

public class DeleteMyNotiHandler implements CommandHandler {

	private DeleteMyNotiService deleteNotiService = new DeleteMyNotiService();
	private ReadMyNotiService notiService = new ReadMyNotiService();

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Exception {
		User authUser = (User) request.getSession().getAttribute("authUser");

		String noti_no = request.getParameter("noti_no");
		int notiNo = Integer.parseInt(noti_no);

		deleteNotiService.delete(notiNo);

		boolean notiCheck = notiService.isNotiCheck(authUser.getId());
		request.getSession().setAttribute("notiCheck", notiCheck);

		return null;
	}

}
