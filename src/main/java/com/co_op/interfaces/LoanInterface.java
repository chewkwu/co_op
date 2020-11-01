package com.co_op.interfaces;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.co_op.entities.Loan;
import com.co_op.entities.Member;

@Component
public interface LoanInterface extends CrudRepository<Loan,Integer>{

	public List<Loan> findByMember(Member member);
	
}
