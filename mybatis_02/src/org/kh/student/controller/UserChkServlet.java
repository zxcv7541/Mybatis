package org.kh.student.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kh.student.model.service.UserServiceImpl;
import org.kh.student.model.vo.User;

/**
 * Servlet implementation class UserChkServlet
 */
@WebServlet(name = "UserChk", urlPatterns = { "/userChk" })
public class UserChkServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserChkServlet() {
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
		
		User reU=new UserServiceImpl().userChk(u);
		
		RequestDispatcher view=request.getRequestDispatcher("/views/user/user.jsp");
		request.setAttribute("user", reU);
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
