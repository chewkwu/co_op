package com.co_op.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Member {

	@Id
	@Column
	private String accountNo;
	
	@Column
	private String empNo;
	
	@Column
	private String surname;
	
	@Column
	private String otherNames;
	
	@Column
	private Date dob;
	
	@Column
	private String sex;
	
	@Column
	private String maritalStatus;
	
	@Column
	private String companyName;
	
	@Column
	private String nationality;
	
	@Column
	private String state;
	
	@Column
	private String lga;
	
	@Column
	private String address;
	
	@Column
	private String nextOfKin;
	
	@Column
	private String relationshipOfNextOfKin;
	
	@Column
	private String nextOfKinPhone;
	
	@Column
	private Date startDate;
	
	@Column
	private Date exitDate;
	
	@Column
	private String passportLink;
	
	@Column
	private String printLink;
	
	@Column
	private String memberPhone;
	
	@Column
	private String memberStatus;
	
	@Column
	private double memberBalance;
	
	public String getMemberPhone() {
		return memberPhone;
	}
	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}
	public String getMemberStatus() {
		return memberStatus;
	}
	public void setMemberStatus(String memberStatus) {
		this.memberStatus = memberStatus;
	}
	public double getMemberBalance() {
		return memberBalance;
	}
	public void setMemberBalance(double memberBalance) {
		this.memberBalance = memberBalance;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getEmpNo() {
		return empNo;
	}
	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getOtherNames() {
		return otherNames;
	}
	public void setOtherNames(String otherNames) {
		this.otherNames = otherNames;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getLga() {
		return lga;
	}
	public void setLga(String lga) {
		this.lga = lga;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getNextOfKin() {
		return nextOfKin;
	}
	public void setNextOfKin(String nextOfKin) {
		this.nextOfKin = nextOfKin;
	}
	public String getRelationshipOfNextOfKin() {
		return relationshipOfNextOfKin;
	}
	public void setRelationshipOfNextOfKin(String relationshipOfNextOfKin) {
		this.relationshipOfNextOfKin = relationshipOfNextOfKin;
	}
	public String getNextOfKinPhone() {
		return nextOfKinPhone;
	}
	public void setNextOfKinPhone(String nextOfKinPhone) {
		this.nextOfKinPhone = nextOfKinPhone;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getExitDate() {
		return exitDate;
	}
	public void setExitDate(Date exitDate) {
		this.exitDate = exitDate;
	}
	public String getPassportLink() {
		return passportLink;
	}
	public void setPassportLink(String passportLink) {
		this.passportLink = passportLink;
	}
	public String getPrintLink() {
		return printLink;
	}
	public void setPrintLink(String printLink) {
		this.printLink = printLink;
	}
	
}
