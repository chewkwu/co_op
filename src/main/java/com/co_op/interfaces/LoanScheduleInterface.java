package com.co_op.interfaces;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.co_op.entities.Loan;
import com.co_op.entities.LoanSchedule;

@Component
public interface LoanScheduleInterface extends CrudRepository<LoanSchedule,Integer>{

	public List<LoanSchedule> findByLoan(Loan loan);
	
}
