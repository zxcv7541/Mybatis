package org.kh.member.model.service;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.kg.common.SqlSessionTemplate;
import org.kh.member.model.DAO.MemberDAO;
import org.kh.member.model.vo.Check;
import org.kh.member.model.vo.Member;
import org.kh.member.model.vo.Search;

public class MemberService {

	public Member memberSelectOne(Member m) {
		SqlSession session=SqlSessionTemplate.getSqlSession();
		Member resultM=new MemberDAO().memberSelectOne(session,m);
		return resultM;
	}

	public int updateMember(Member m) {
		SqlSession session=SqlSessionTemplate.getSqlSession();
		int result=new MemberDAO().updateMember(session,m);
		
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

	public int deleteMember(String memberId) {
		SqlSession session=SqlSessionTemplate.getSqlSession();
		int result=new MemberDAO().deleteMember(session,memberId);
		
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

	public int memberInsert(Member m) {
		SqlSession session=SqlSessionTemplate.getSqlSession();
		int result=new MemberDAO().memberInsert(session,m);
		
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

	public ArrayList<Member> memberAll() {
		SqlSession session=SqlSessionTemplate.getSqlSession();
		ArrayList<Member> list=new MemberDAO().memberAll(session);
		return list;
	}

	public ArrayList<Member> searchMember(Search search) {
		SqlSession session=SqlSessionTemplate.getSqlSession();
		ArrayList<Member> list=new MemberDAO().searchMember(session,search);
		return list;
	}

	public ArrayList<Member> checkList(Check c) {
		SqlSession session=SqlSessionTemplate.getSqlSession();
		ArrayList<Member> list=new MemberDAO().checkList(session,c);
		return list;
	}

	public ArrayList<Member> search3MemberList(String[] addr) {
		SqlSession session=SqlSessionTemplate.getSqlSession();
		ArrayList<Member> list=new MemberDAO().search3MemberList(session,addr);
		return list;
	}

	public Member memberInfo(Member m) {
		SqlSession session=SqlSessionTemplate.getSqlSession();
		Member resultM=new MemberDAO().memberInfo(session,m);
		return resultM;
	}


}
