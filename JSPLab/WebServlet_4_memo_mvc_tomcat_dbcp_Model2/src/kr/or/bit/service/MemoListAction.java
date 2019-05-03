package kr.or.bit.service;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.bit.action.Action;
import kr.or.bit.action.ActionForward;
import kr.or.bit.dao.memodao;
import kr.or.bit.dto.memo;

public class MemoListAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		ActionForward forward =null;
		
    	try {
    		memodao dao = new memodao();
    		List<memo> memolist = dao.getMemoAllList();
    		
    		request.setAttribute("memolist", memolist);
    		
    		forward = new ActionForward();
    		forward.setRedirect(false);
    		forward.setPath("/WEB-INF/memo/memolist.jsp");
    		
    		
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    	
		return forward;
	}

}
