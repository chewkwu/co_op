package com.co_op.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class LoanSchedule {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int loanScheduleID;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="loanID")
	private Loan loan;
	
	@Column
	private double scheduleAmount;
	
	@Column
	private Date scheduleDate;
	
	@Column
	private String paymentStatus;
	
	@Column
	private double paidAmount;

	public int getLoanScheduleID() {
		return loanScheduleID;
	}

	public void setLoanScheduleID(int loanScheduleID) {
		this.loanScheduleID = loanScheduleID;
	}

	public Loan getLoan() {
		return loan;
	}

	public void setLoan(Loan loan) {
		this.loan = loan;
	}

	public double getScheduleAmount() {
		return scheduleAmount;
	}

	public void setScheduleAmount(double scheduleAmount) {
		this.scheduleAmount = scheduleAmount;
	}

	public Date getScheduleDate() {
		return scheduleDate;
	}

	public void setScheduleDate(Date scheduleDate) {
		this.scheduleDate = scheduleDate;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public double getPaidAmount() {
		return paidAmount;
	}

	public void setPaidAmount(double paidAmount) {
		this.paidAmount = paidAmount;
	}
	
}
