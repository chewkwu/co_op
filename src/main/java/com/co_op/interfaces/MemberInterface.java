package com.co_op.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.co_op.entities.Member;

@Component
public interface MemberInterface extends CrudRepository<Member,String>{

	public Member findByMemberPhone(String memberPhone);
	
}
