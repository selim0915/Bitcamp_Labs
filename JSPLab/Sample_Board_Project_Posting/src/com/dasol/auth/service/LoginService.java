package com.dasol.auth.service;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.NamingException;

import com.dasol.jdbc.ConnectionProvider;
import com.dasol.jdbc.JdbcUtil;
import com.dasol.member.dao.MemberDAO;
import com.dasol.member.model.Member;
import com.dasol.util.TokenGenerator;

public class LoginService {
	MemberDAO memberDAO = new MemberDAO();

	public User login(String email, String password, String remember) throws NamingException {
		Connection conn = null;
		String token = null;
		try {
			conn = ConnectionProvider.getConnection();
			conn.setAutoCommit(false);
			
			Member member = memberDAO.selectByEmail(conn, email);

			if (member == null) {
				throw new LoginFailException();
			}
			
			if(member.getPassword() == null) {
				throw new PasswordNotFoundException();
			}
			
			if (!member.matchPassword(password)) {
				throw new LoginFailException();
			}

			if (remember != null) { // 체크가 없었던 유저가 로그인 시
				token = TokenGenerator.getTokenKey(); // 토큰키를 생성해서 dao에 넣어준다.
				memberDAO.updateToken(conn, member.getMemberId(), token);
			}
			
			boolean passwordCheck = member.getPassword() == null ? false : true;
			
			conn.commit();
			return new User(member.getMemberId(), 
					member.getEmail(), 
					member.isRegisterCheck(), 
					token,
					passwordCheck,
					member.getNickname(),
					member.getProfileImage());
			
		} catch (SQLException e) {
			JdbcUtil.rollback(conn);
			throw new RuntimeException(e);
		} finally {
			JdbcUtil.close(conn);
		}

	}
}
