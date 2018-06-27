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
 * Servlet implementation class IdCheckServlet
 */
@WebServlet(name = "IdCheck", urlPatterns = { "/idCheck" })
public class IdCheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IdCheckServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String userId=request.getParameter("userId");
		
		User u=new UserServiceImpl().idChk(userId);
		response.setContentType("text/html; charset=utf-8");
		if(u!=null)
		{
			
			response.getWriter().println("존재하는 아이디");
		}
		else
		{
			response.getWriter().println("사용가능.");
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
