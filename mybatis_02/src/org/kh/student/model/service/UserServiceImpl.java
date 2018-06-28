package org.kh.student.model.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.kh.student.model.dao.UserDAOImpl;
import org.kh.student.model.vo.User;

public class UserServiceImpl implements UserService{

	@Override
	public User selectUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertUser() {
		return 0;
		
	}

	public int insertUser(User u) {
		SqlSession session=getSqlSession();
		int result=new UserDAOImpl().insertUser(session,u);
		
		if(result>0) 
		{
			session.commit();
		}
		else
		{
			session.rollback();
		}
		
	return result;
		
	}
	
	public SqlSession getSqlSession() {
		
		String resource="/mybatis-config.xml";
		SqlSession session=null;
		
		try {
			InputStream is=Resources.getResourceAsStream(resource);
			SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
			
			SqlSessionFactory factory=builder.build(is);
			session=factory.openSession(false);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return session;
	}

	public User idChk(String userId) {
		SqlSession session=getSqlSession();
		User u=new UserDAOImpl().idChk(session,userId);
		return u;
		
	}

	public User userChk(User u) {
		SqlSession session=getSqlSession();
		User reU=new UserDAOImpl().userChk(session,u);
		return reU;
		
	}

	public ArrayList<User> userAll() {
		SqlSession session=getSqlSession();
		ArrayList<User> list=new UserDAOImpl().userAll(session);
		return list;
	}

	public int deleteUser(User u) {
		SqlSession session=getSqlSession();
		int result=new UserDAOImpl().deleteUser(session,u);
		return result;
	}

	
	public int updateUser(User u) {
		SqlSession session=getSqlSession();
		int result=new UserDAOImpl().updateUser(session,u);
		
		if(result>0) 
		{
			session.commit();
		}
		else
		{
			session.rollback();
		}
		
		return result;
	}

}
