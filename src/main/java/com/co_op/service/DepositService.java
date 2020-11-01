package com.co_op.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.co_op.entities.Deposit;
import com.co_op.entities.Member;
import com.co_op.interfaces.DepositInterface;
import com.co_op.interfaces.MemberInterface;

@Service
public class DepositService {

	@Autowired
	DepositInterface depositInterface;
	
	@Autowired
	MemberInterface memberInterface;
	
	public Deposit makeDeposit(Deposit deposit) {
		Deposit dep = depositInterface.save(deposit);
		Member mem = deposit.getMember();
		mem.setMemberBalance(mem.getMemberBalance() + dep.getDepositAmount());
		memberInterface.save(mem);
		return dep;
	}
	
	public List<Deposit> allDeposit(){
		List<Deposit> deposits = new ArrayList<>();
		Iterable<Deposit> allDeposits = depositInterface.findAll();
		allDeposits.forEach(e -> deposits.add(e));
		return deposits;
	}
	
	public List<Deposit> allDepositsByMember(Member member){
		return depositInterface.findByMember(member);
	}
	public void cancelDeposit(Deposit deposit) {
		depositInterface.delete(deposit);
	}
	
	public Deposit getDeposit(int depositID) {
		return depositInterface.findById(depositID).get();
	}
	
}
