package com.co_op.interfaces;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.co_op.entities.Deposit;
import com.co_op.entities.Member;


@Component
public interface DepositInterface extends CrudRepository<Deposit,Integer>{

	public List<Deposit> findByMember(Member member);
	
}
