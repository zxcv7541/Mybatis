package org.kh.users.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kh.users.model.service.UserService;
import org.kh.users.model.vo.Check;
import org.kh.users.model.vo.User;

/**
 * Servlet implementation class MemberListServlet
 */
@WebServlet(name = "MemberList", urlPatterns = { "/memberList" })
public class MemberListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.process(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.process(request, response);
	}
	protected void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		request.setCharacterEncoding("utf-8");
		
		Check check=new Check(
				request.getParameter("chId"),
				request.getParameter("chPw"),
				request.getParameter("chName"),
				request.getParameter("chAddr")
				);
		
		ArrayList<User> list=new UserService().checkUserList(check);
		
		response.setContentType("text/html; charset=utf-8");
		if(!list.isEmpty())
		{
			request.setAttribute("list", list);
			request.getRequestDispatcher("/views/users/checkList.jsp").forward(request, response);
		}
		else
		{
			response.getWriter().print("읽어오기 실패");
		}
	}

}
