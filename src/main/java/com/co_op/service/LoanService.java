package com.co_op.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.co_op.balancecalc.PaymentCalculator;
import com.co_op.entities.Loan;
import com.co_op.entities.LoanSchedule;
import com.co_op.entities.Member;
import com.co_op.interfaces.LoanInterface;
import com.co_op.interfaces.LoanScheduleInterface;


@Service
public class LoanService {

	@Autowired
	LoanInterface loanInterface;
	
	@Autowired
	LoanScheduleInterface loanScheduleInterface;
	
	public Loan createLoan(Loan loan) {
		double paymentAmount = PaymentCalculator.calculatePaymentAmount(loan.getLoanAmount(), loan.getLoanDuration());
		double installmentAmount = paymentAmount/loan.getLoanDuration();
		Loan createdLoan = loanInterface.save(loan);
		for(int i = 0; i < loan.getLoanDuration(); i++) {
			LoanSchedule ls = new LoanSchedule();
			ls.setLoan(createdLoan);
			ls.setScheduleAmount(installmentAmount);
			loanScheduleInterface.save(ls);
		}
		return createdLoan;
	}
	
	public void cancelLoan(Loan loan) {
		List<LoanSchedule> ls = loanScheduleInterface.findByLoan(loan);
		for(LoanSchedule als: ls) {
			loanScheduleInterface.delete(als);
		}
		loanInterface.delete(loan);
	}
	
	public List<Loan> allLoans() {
		List<Loan> loans = new ArrayList<>();
		Iterable<Loan> allLoans = loanInterface.findAll();
		allLoans.forEach(e -> loans.add(e));
		return loans;
	}
	
	public List<Loan> allLoansByMember(Member member){
		return loanInterface.findByMember(member);
	}
	
	public Loan showLoan(int loanID) {
		return loanInterface.findById(loanID).get();
	}
	
}
