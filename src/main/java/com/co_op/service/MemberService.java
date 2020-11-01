package com.co_op.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.co_op.entities.Member;
import com.co_op.interfaces.MemberInterface;

@Service
public class MemberService {

	@Autowired
	MemberInterface memberInterface;
	
	public Member createMember(Member member) {
		return memberInterface.save(member);
	}
	
	public Member findMember(String memberPhone) {
		return memberInterface.findByMemberPhone(memberPhone);
	}
	
	public Member updateMember(Member member) {
		return memberInterface.save(member);
	}
	
	public List<Member> allMembers(){
		Iterable<Member> members = memberInterface.findAll();
		List<Member> allMembers = new ArrayList<>();
		members.forEach(e -> allMembers.add(e));
		return allMembers;
	}
	
	public void removeMember(Member member) {
		memberInterface.delete(member);
	}
	
	public Member findByAccountNo(String accountNo) {
		return memberInterface.findById(accountNo).get();
	}
	
}
