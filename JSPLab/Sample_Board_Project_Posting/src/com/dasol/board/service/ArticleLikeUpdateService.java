package com.dasol.board.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.naming.NamingException;

import com.dasol.board.dao.ArticleDAO;
import com.dasol.board.model.Article;
import com.dasol.board.model.ArticleLike;
import com.dasol.jdbc.ConnectionProvider;
import com.dasol.jdbc.JdbcUtil;

public class ArticleLikeUpdateService {
	ArticleDAO articleDAO = new ArticleDAO();

	public ArticleLikeData like(ArticleLike articleLike) throws NamingException {
		Connection conn = null;

		try {
			conn = ConnectionProvider.getConnection();
			conn.setAutoCommit(false);
			Article article = articleDAO.selectByNo(conn, articleLike.getArticleNo());

			if (article == null) {
				JdbcUtil.rollback(conn);
				throw new ArticleNotFoundException();
			}

			ArticleLike savedArticleLike = articleDAO.insertLike(conn, articleLike);
			
			List<ArticleLike> likeList = articleDAO.getArticleLikeList(conn, savedArticleLike.getArticleNo());
					
			updateArticleLikeCnt(conn, savedArticleLike.getArticleNo(), likeList.size());
			
			conn.commit();
			return new ArticleLikeData(likeList.size(), savedArticleLike);

		} catch (SQLException e) {
			JdbcUtil.rollback(conn);
			throw new RuntimeException(e);
		} finally {
			JdbcUtil.close(conn);
		}
	}

	public int unlike(int likeNo, int articleNo) throws NamingException {
		Connection conn = null;
		try {
			conn = ConnectionProvider.getConnection();

			ArticleLike articleLike = articleDAO.getArticleLike(conn, likeNo);

			if (articleLike == null) {
				throw new ArticleLikeNotFoundException();
			}

			articleDAO.deleteArticleLike(conn, likeNo);
			
			List<ArticleLike> articleLikeList = articleDAO.getArticleLikeList(conn, articleNo);
			
			updateArticleLikeCnt(conn, articleNo, articleLikeList.size());

			return articleLikeList.size();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			JdbcUtil.close(conn);
		}
	}

	public boolean isLikeIt(int articleNo, int memberId) throws NamingException {
		Connection conn = null;
		try {
			conn = ConnectionProvider.getConnection();
			List<ArticleLike> articleLikeList = articleDAO.getArticleLikeList(conn, articleNo);

			for (ArticleLike articleLike : articleLikeList) {
				if (articleLike.isLikeIt(memberId)) {
					return true;
				}
			}
			return false;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			JdbcUtil.close(conn);
		}
	}
	
	private void updateArticleLikeCnt(Connection conn, int no, int totLikeCnt) throws SQLException {
		articleDAO.updateLikeCnt(conn, no, totLikeCnt);
	}

}
