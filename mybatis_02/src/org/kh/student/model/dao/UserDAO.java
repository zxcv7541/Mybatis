package org.kh.student.model.dao;

import org.apache.ibatis.session.SqlSession;
import org.kh.student.model.vo.User;

public interface UserDAO {
	public User selectUser();
	public int insertUser(SqlSession session);


}
