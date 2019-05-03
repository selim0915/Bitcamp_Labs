package com.dasol.noti.service;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.NamingException;

import com.dasol.jdbc.ConnectionProvider;
import com.dasol.noti.dao.MyNotiDAO;

public class UpdateMyNotiService {
	
	private MyNotiDAO notiDAO = new MyNotiDAO();
	
	public void update(int notiNo) throws NamingException {
		try (Connection conn = ConnectionProvider.getConnection()) {
			
			int noti = notiDAO.selectById(conn, notiNo);
			
			if(noti <= 0) {
				throw new NotificationNotFoundException();
			}
			
			notiDAO.update(conn, noti);
			
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
