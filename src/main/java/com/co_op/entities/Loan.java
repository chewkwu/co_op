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
public class Loan {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int loanID;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="accountNo")
	private Member member;
	
	@Column
	private double loanAmount;
	
	@Column
	private Date loanDate;
	
	@Column
	private int loanDuration;
	
	public int getLoanID() {
		return loanID;
	}
	public void setLoanID(int loanID) {
		this.loanID = loanID;
	}
	
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public Date getLoanDate() {
		return loanDate;
	}
	public void setLoanDate(Date loanDate) {
		this.loanDate = loanDate;
	}
	public int getLoanDuration() {
		return loanDuration;
	}
	public void setLoanDuration(int loanDuration) {
		this.loanDuration = loanDuration;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	public Member getMember() {
		return member;
	}
	
}
