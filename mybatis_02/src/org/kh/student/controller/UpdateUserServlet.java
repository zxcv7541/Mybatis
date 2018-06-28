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
 * Servlet implementation class UpdateUserServlet
 */
@WebServlet(name = "UpdateUser", urlPatterns = { "/updateUser" })
public class UpdateUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		User u=new User();
		u.setUserPw(request.getParameter("userPw"));
		u.setUserId(request.getParameter("userId"));
		u.setUserNick(request.getParameter("userNick"));
		u.setUserTel(request.getParameter("userTel"));
		
		int result=new UserServiceImpl().updateUser(u);
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
