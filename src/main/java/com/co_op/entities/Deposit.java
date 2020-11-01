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
public class Deposit {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int depositID;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="accountNo")
	private Member member;
	
	@Column
	private Date depositDate;
	
	@Column
	private double depositAmount;
	
	public int getDepositID() {
		return depositID;
	}
	public void setDepositID(int depositID) {
		this.depositID = depositID;
	}
	public Date getDepositDate() {
		return depositDate;
	}
	public void setDepositDate(Date depositDate) {
		this.depositDate = depositDate;
	}
	public double getDepositAmount() {
		return depositAmount;
	}
	public void setDepositAmount(double depositAmount) {
		this.depositAmount = depositAmount;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	
}
