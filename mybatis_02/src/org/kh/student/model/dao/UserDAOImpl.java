package org.kh.student.model.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.kh.student.model.vo.User;

public class UserDAOImpl implements UserDAO {

	@Override
	public User selectUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertUser(SqlSession session) {
		return 0;
	}

	public int insertUser(SqlSession session, User u) {
		int result=session.insert("user.join",u);
		return result;
	}

	public User idChk(SqlSession session, String userId) {
		User u=session.selectOne("user.idChk", userId);
		return u;
		
	}

	public User userChk(SqlSession session, User u) {
		User reU=session.selectOne("user.userChk", u);
		return reU;
	}

	public ArrayList<User> userAll(SqlSession session) {
		List list=session.selectList("user.userAll");
		return (ArrayList<User>)list;
	}

	public int deleteUser(SqlSession session, User u) {
		int result=session.delete("user.deleteUser", u);
		return result;
	}

	public int updateUser(SqlSession session, User u) {
		int result=session.insert("user.updateUser", u);
		return result;
	}

}
