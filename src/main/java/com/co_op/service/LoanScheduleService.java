package com.co_op.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.co_op.entities.Loan;
import com.co_op.entities.LoanSchedule;
import com.co_op.interfaces.LoanScheduleInterface;


@Service
public class LoanScheduleService {

	@Autowired
	LoanScheduleInterface loanScheduleInterface;
	
	public LoanSchedule createLoanSchedule(LoanSchedule loanSchedule) {
		return loanScheduleInterface.save(loanSchedule);
	}

	public void deleteLoanSchedule(LoanSchedule loanSchedule) {
		loanScheduleInterface.delete(loanSchedule);
	}
	
	public List<LoanSchedule> allScheduleForLoan(Loan loan){
		return loanScheduleInterface.findByLoan(loan);
	}
	
	public LoanSchedule getSchedule(int scheduleID) {
		return loanScheduleInterface.findById(scheduleID).get();
	}
	
}
