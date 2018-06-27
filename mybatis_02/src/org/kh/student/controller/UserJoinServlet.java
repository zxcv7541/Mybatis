package org.kh.student.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kh.student.model.service.UserServiceImpl;
import org.kh.student.model.vo.User;

/**
 * Servlet implementation class UserJoinServlet
 */
@WebServlet(name = "UserJoin", urlPatterns = { "/userJoin" })
public class UserJoinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserJoinServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		User u=new User();
		u.setUserId(request.getParameter("userId"));
		u.setUserPw(request.getParameter("userPw"));
		u.setUserNick(request.getParameter("userNick"));
		u.setUserTel(request.getParameter("tel"));
		
		int result=new UserServiceImpl().insertUser(u);
		
		if(result>0)
		{
			response.setContentType("text/html; charset=utf-8");
			response.getWriter().println("정상 처리 되었습니다.");
		}
		else
		{
			response.getWriter().println("실패되었습니다.");
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
