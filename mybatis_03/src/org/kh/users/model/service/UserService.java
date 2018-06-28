package org.kh.users.model.service;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.kh.common.SqlSessionTemplate;
import org.kh.users.model.DAO.UserDAO;
import org.kh.users.model.vo.Check;
import org.kh.users.model.vo.Search;
import org.kh.users.model.vo.User;

public class UserService {
	public ArrayList<User> checkUserList(Check check) {
		SqlSession session=SqlSessionTemplate.getSqlSession();
		ArrayList<User> list=new UserDAO().checkUserList(session,check);
		return list;
	}

	public ArrayList<User> searchUserList(Search search) {
		SqlSession session=SqlSessionTemplate.getSqlSession();
		ArrayList<User> list=new UserDAO().searchUserList(session,search);
		return list;
	}

	public ArrayList<User> search2UserList(User user) {
		SqlSession session=SqlSessionTemplate.getSqlSession();
		ArrayList<User> list=new UserDAO().search2UserList(session,user);
		return list;
	}

	public ArrayList<User> search3UserList(String[] addr) {
		SqlSession session=SqlSessionTemplate.getSqlSession();
		ArrayList<User> list=new UserDAO().search3UserList(session,addr);
		return list;
	}

}
