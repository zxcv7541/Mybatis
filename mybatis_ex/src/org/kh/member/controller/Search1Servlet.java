package org.kh.member.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kh.member.model.service.MemberService;
import org.kh.member.model.vo.Member;
import org.kh.member.model.vo.Search;

/**
 * Servlet implementation class Search1Servlet
 */
@WebServlet(name = "Search1", urlPatterns = { "/search1" })
public class Search1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Search1Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String searchRadio=request.getParameter("searchRadio");
		String searchKeyword=request.getParameter("searchKeyword");
		
		Search search=new Search();
		search.setSearchKeyword(searchKeyword);
		search.setSearchRadio(searchRadio);
		
		ArrayList<Member> list=new MemberService().searchMember(search);
		
		if(!list.isEmpty()) {
			RequestDispatcher view=request.getRequestDispatcher("/views/memberAll.jsp");
			request.setAttribute("member", list);
			view.forward(request, response);
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
