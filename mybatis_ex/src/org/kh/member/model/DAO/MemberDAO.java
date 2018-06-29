package org.kh.member.model.DAO;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.kh.member.model.vo.Check;
import org.kh.member.model.vo.Member;
import org.kh.member.model.vo.Search;

public class MemberDAO {

	public Member memberSelectOne(SqlSession session, Member m) {
		Member resultM=session.selectOne("members.selectOne",m);
		return resultM;
	}

	public int updateMember(SqlSession session, Member m) {
		int result=session.update("members.update", m);
		return result;
	}

	public int deleteMember(SqlSession session, String memberId) {
		int result=session.delete("members.delete", memberId);
		return result;
	}

	public int memberInsert(SqlSession session, Member m) {
		int result=session.insert("members.insert", m);
		return result;
	}

	public ArrayList<Member> memberAll(SqlSession session) {
		List list=session.selectList("members.selectAll");
		return (ArrayList<Member>)list;
	}

	public ArrayList<Member> searchMember(SqlSession session, Search search) {
		List list=session.selectList("members.searchAll",search);
		return (ArrayList<Member>)list;
	}

	public ArrayList<Member> checkList(SqlSession session, Check c) {
		List list=session.selectList("members.check",c);
		return (ArrayList<Member>)list;
	}

	public Member memberInfo(SqlSession session, Member m) {
		Member resultM=session.selectOne("members.selectInfo",m);
		return resultM;
	}

	public ArrayList<Member> search3MemberList(SqlSession session, String[] addr) {
		List list=session.selectList("members.search3",addr);
		return (ArrayList<Member>)list;
	}

}
