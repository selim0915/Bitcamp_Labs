package com.dasol.noti.service;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.NamingException;

import com.dasol.jdbc.ConnectionProvider;
import com.dasol.noti.dao.MyNotiDAO;

public class DeleteMyNotiService {
	private MyNotiDAO mynotiDAO = new MyNotiDAO();
	
	public void delete(int notiNo) throws NamingException {
		try (Connection conn = ConnectionProvider.getConnection()) {
			
			int noti = mynotiDAO.selectById(conn, notiNo);
			
			if (noti <= 0) {
				throw new NotificationNotFoundException();
			}
			
			mynotiDAO.delete(conn, noti);
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
