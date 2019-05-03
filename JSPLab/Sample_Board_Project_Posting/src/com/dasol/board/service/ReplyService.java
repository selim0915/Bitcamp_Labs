package com.dasol.board.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.naming.NamingException;

import com.dasol.board.dao.ArticleDAO;
import com.dasol.board.model.Article;
import com.dasol.board.model.ArticleReply;
import com.dasol.jdbc.ConnectionProvider;
import com.dasol.jdbc.JdbcUtil;

public class ReplyService {
	ArticleDAO articleDAO = new ArticleDAO();
	private static final int REPLY_SIZE = 5;

	public ReplyData insertReply(ArticleReply articleReply, int replyPage) throws NamingException {
		Connection conn = null;

		try {
			conn = ConnectionProvider.getConnection();
			conn.setAutoCommit(false);

			Article article = articleDAO.selectByNo(conn, articleReply.getArticleNo());

			if (article == null) {
				JdbcUtil.rollback(conn);
				throw new ArticleNotFoundException();
			}

			article = articleDAO.insertReply(conn, articleReply);

			updateArticleReplyCnt(conn, article.getNumber(), article.getArticleReplySize());

			List<ArticleReply> articleReplyList 
				= articleDAO.getArticleReplyList(conn, article.getNumber());

			conn.commit();
			return new ReplyData(article.getArticleReplySize(), articleReplyList);

		} catch (SQLException e) {
			JdbcUtil.rollback(conn);
			throw new RuntimeException(e);
		} finally {
			JdbcUtil.close(conn);
		}
	}

	public ReplyData selectReply(int articleNo) throws NamingException {
		Connection conn = null;
		
		try {
			conn = ConnectionProvider.getConnection();
			
			Article article = articleDAO.selectByNo(conn, articleNo);

			if (article == null) {
				JdbcUtil.rollback(conn);
				throw new ArticleNotFoundException();
			}
			
			List<ArticleReply> articleReplyList = articleDAO.getArticleReplyList(conn, articleNo);
			
			return new ReplyData(article.getArticleReplySize(), articleReplyList);
			
		} catch (SQLException e) {
			JdbcUtil.rollback(conn);
			throw new RuntimeException(e);
		} finally {
			JdbcUtil.close(conn);
		}
	}

	public ReplyData deleteReply(int articleNo, int replyNo) throws NamingException {
		Connection conn = null;
		try {
			conn = ConnectionProvider.getConnection();
			Article article = articleDAO.selectByNo(conn, articleNo);

			if (article == null) {
				throw new ArticleNotFoundException();
			}

			articleDAO.deleteArticleReply(conn, replyNo);

			List<ArticleReply> articleReplyList = articleDAO.getArticleReplyList(conn, articleNo);
			updateArticleReplyCnt(conn, articleNo, articleReplyList.size());
			
			return new ReplyData(articleReplyList.size(), articleReplyList);

		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			JdbcUtil.close(conn);
		}

	}

	private void updateArticleReplyCnt(Connection conn, int no, int totReplyCnt) throws SQLException {
		articleDAO.updateReplyCnt(conn, no, totReplyCnt);
	}
}
