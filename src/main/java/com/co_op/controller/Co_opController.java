package com.co_op.controller;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.co_op.entities.*;
import com.co_op.service.DepositService;
import com.co_op.service.LoanScheduleService;
import com.co_op.service.LoanService;
import com.co_op.service.MemberService;
import com.co_op.service.UserService;

@Controller
public class Co_opController {

	@Autowired
	UserService userService;
	
	@Autowired
	MemberService memberService;
	
	@Autowired
	DepositService depositService;
	
	@Autowired
	LoanService loanService;
	
	@Autowired
	LoanScheduleService loanScheduleService;
		
	@GetMapping("/")
	public String loginPage() {
		return "login.jsp";
	}
	
	@PostMapping("/login")
	public String login(@RequestParam("username") String username,
            @RequestParam("password") String password) {
		User user = null;
		List<User> users = userService.findByUsername(username);
		if(users.isEmpty()) {
			System.out.println("login error");
			return "loginerr.jsp";
		}else {
		for(User usr: users) {
			if(usr.getPassword().equals(password)) {
				user = usr;
			}
		}
		if(user == null) {
			System.out.println("login error");
			return "loginerr.jsp";
		}else {
			if(user.getRole().equalsIgnoreCase("admin")) {
				System.out.println("Admin menu");
				return "adminmenu.jsp";
			}else {
				System.out.println("Member menu");
				return "membermenu.jsp";
			}
		}
		}
	}
	
	@PostMapping("/createMember")
	public String createMember(ModelMap model, @RequestParam("accountNo") String accountNo, @RequestParam("surname") String surname, @RequestParam("phone") String phone,
			@RequestParam("balance") String balance, @RequestParam("empNo") String empNo, @RequestParam("sex") String sex, @RequestParam("companyName") String companyName,
			@RequestParam("username") String username, @RequestParam("otherName") String otherName, @RequestParam("maritalStatus") String maritalStatus,
			@RequestParam("password") String password, @RequestParam("dob") String dob, @RequestParam("nationality") String nationality, @RequestParam("relOfKin") String relOfKin,
			@RequestParam("state") String state, @RequestParam("lga") String lga, @RequestParam("address") String address, @RequestParam("nextOfKin") String nextOfKin,
			@RequestParam("nokPhone") String nokPhone) {
		Member member = new Member();
		member.setAccountNo(accountNo);
		member.setEmpNo(empNo);
		member.setSurname(surname);
		member.setOtherNames(otherName);
		member.setMemberPhone(phone);
		member.setMemberBalance(Double.parseDouble(balance));
		member.setMemberStatus("active");
		member.setDob(Date.valueOf(dob));
		member.setSex(sex);
		member.setMaritalStatus(maritalStatus);
		member.setCompanyName(companyName);
		member.setNationality(nationality);
		member.setState(state);
		member.setLga(lga);
		member.setAddress(address);
		member.setNextOfKin(nextOfKin);
		member.setRelationshipOfNextOfKin(relOfKin);
		member.setNextOfKinPhone(nokPhone);
		member.setStartDate(Date.valueOf(LocalDate.now()));
		Member regMemb = memberService.createMember(member);
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setRole("user");
		User regUser = userService.createUser(user);
		if(regMemb != null && regUser != null) {
		model.addAttribute("member",regMemb);
		return "amember.jsp";
		}else {
			model.addAttribute("message", "Member Creation Failed");
			return "membererr.jsp";
		}
	}
	
	@PostMapping("/viewBalance")
	public String viewBalance(ModelMap model, @RequestParam("phone") String phone) {
		Member member = memberService.findMember(phone);
		if(member != null) {
			model.addAttribute("member", member);
			return "memberBalance.jsp";
		}else {
			model.addAttribute("message", "No member with phone number");
			return "membermenuerr.jsp";
		}
				}
	
	@PostMapping("allContributionByMember")
	public String allContributionByMember(ModelMap model, @RequestParam("phone") String phone) {
		List<Deposit> allDeposits = depositService.allDepositsByMember(memberService.findMember(phone));
		if(allDeposits == null || allDeposits.isEmpty()) {
			model.addAttribute("message", "No such Contributor");
			return "membermenuerr.jsp";
		}else {
			model.addAttribute("allDeposits", allDeposits);
			return "memberContribution.jsp";
		}
	}
	
	@PostMapping("viewALoan")
	public String viewALoan(ModelMap model, @RequestParam("loanID") String loanID) {
		Loan loan = loanService.showLoan(Integer.parseInt(loanID));
		if(loan == null) {
			model.addAttribute("message", "No such Loan");
			return "membermenuerr.jsp";
		}else {
			model.addAttribute("loan", loan);
			return "aloan.jsp";
		}
	}
	
	@PostMapping("viewLoansByMember")
	public String viewLoansByMember(ModelMap model, @RequestParam("accountNo") String accountNo) {
		List<Loan> allLoans = loanService.allLoansByMember(memberService.findByAccountNo(accountNo));
		if(allLoans.isEmpty()) {
			model.addAttribute("message", "Member has no Loans");
			return "membermenuerr.jsp";
		}else {
			model.addAttribute("allLoans", allLoans);
			return "memberloans.jsp";
		}
	}
	
	@PostMapping("makeDeposit")
	public String makeDeposit(ModelMap model, @RequestParam("accountNo") String accountNo, @RequestParam("amount") String amount) {
		Deposit dep = new Deposit();
		dep.setMember(memberService.findByAccountNo(accountNo));
		dep.setDepositAmount(Double.parseDouble(amount));
		dep.setDepositDate(Date.valueOf(LocalDate.now()));
		Deposit deposit = depositService.makeDeposit(dep);
		if(deposit == null) {
			model.addAttribute("message", "Failed to make deposit, Please check Account Number");
			return "depositerr.jsp";
		}else {
			model.addAttribute("deposit", deposit);
			return "adeposit.jsp";
		}
	}
	
	@PostMapping("viewDeposit")
	public String viewDeposit(ModelMap model, @RequestParam("depositID") String depositID) {
		Deposit deposit = depositService.getDeposit(Integer.parseInt(depositID));
		if(deposit == null) {
			model.addAttribute("message", "No such Deposit, Please check Deposit ID");
			return "depositerr.jsp";
		}else {
			model.addAttribute("deposit", deposit);
			return "adeposit.jsp";
		}
	}
	
	@PostMapping("memberDeposits")
	public String memberDeposists(ModelMap model, @RequestParam("phone") String phone) {
		List<Deposit> allDeposits = depositService.allDepositsByMember(memberService.findMember(phone));
		if(allDeposits.isEmpty()) {
			model.addAttribute("message", "No such member, Please check member phone");
			return "depositerr.jsp";
		}else {
			model.addAttribute("allDeposits", allDeposits);
			return "allDeposits.jsp";
		}
	}
	
	@PostMapping("allDeposits")
	public String allDeposits(ModelMap model) {
		List<Deposit> allDepos = depositService.allDeposit();
		if(allDepos.isEmpty()) {
			model.addAttribute("message", "No deposits have been made");
			return "depositerr.jsp";
		}else {
			model.addAttribute("allDeposits", allDepos);
			return "allDeposits.jsp";
		}
	}
	
	@PostMapping("createLoan")
	public String createLoan(ModelMap model, @RequestParam("accountNo") String accountNo, @RequestParam("amount") String amount,
			@RequestParam("duration") String duration) {
		Loan loan = new Loan();
		loan.setMember(memberService.findByAccountNo(accountNo));
		loan.setLoanAmount(Double.parseDouble(amount));
		loan.setLoanDuration(Integer.parseInt(duration));
		loan.setLoanDate(Date.valueOf(LocalDate.now()));
		Loan aloan = loanService.createLoan(loan);
		if(aloan == null) {
			model.addAttribute("message", "Couldn't create Loan, please check details entered");
			return "loanerr.jsp";
		}else {
			Member memb = aloan.getMember();
			memb.setMemberBalance(memb.getMemberBalance() - aloan.getLoanAmount());
			memberService.createMember(memb);
			model.addAttribute("loan", aloan);
			return "theloan.jsp";
		}
	}
	
	@PostMapping("viewLoan")
	public String viewLoan(ModelMap model, @RequestParam("loanID") String loanID) {
		Loan loan = loanService.showLoan(Integer.parseInt(loanID));
		if(loan == null) {
			model.addAttribute("message", "No such Loan");
			return "loanerr.jsp";
		}else {
			model.addAttribute("loan", loan);
			return "theloan.jsp";
		}
	}
	
	@PostMapping("paymentSchedule")
	public String paymentSchedule(ModelMap model, @RequestParam("loanID") String loanID) {
		List<LoanSchedule> schedule = loanScheduleService.allScheduleForLoan(loanService.showLoan(Integer.parseInt(loanID)));
		if(schedule.isEmpty()) {
			model.addAttribute("message", "No such Loan");
			return "loanerr.jsp";
		}else {
			model.addAttribute("schedule", schedule);
			return "schedule.jsp";
		}
	}
	
	@PostMapping("allMemberLoans")
	public String allMemberLoan(ModelMap model, @RequestParam("phone") String phone) {
		List<Loan> memberLoans = loanService.allLoansByMember(memberService.findMember(phone));
		if(memberLoans.isEmpty()) {
			model.addAttribute("message", "No loan for Member");
			return "loanerr.jsp";
		}else {
			model.addAttribute("allLoans", memberLoans);
			return "allLoans.jsp";
		}
	}
	
	@PostMapping("allLoans")
	public String allLoans(ModelMap model) {
		List<Loan> loans = loanService.allLoans();
		if(loans.isEmpty()) {
			model.addAttribute("message", "No loans in Record");
			return "loanerr.jsp";
		}else {
			model.addAttribute("allLoans", loans);
			return "allLoans.jsp";
		}
	}
	
	@PostMapping("createUser")
	public String createUser(ModelMap model, @RequestParam("username") String username, @RequestParam("password") String password,
			@RequestParam("role") String role) {
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setRole(role);
		User usr = userService.createUser(user);
		if(usr == null) {
			model.addAttribute("message", "Failed to create User, please check logs");
		}else {
			model.addAttribute("message", "User create Successfully");
		}
		return "usrmsg.jsp";
	}
	
	@PostMapping("allUsers")
	public String allUsers(ModelMap model) {
		List<User> users = userService.allUsers();
		if(users.isEmpty()) {
			model.addAttribute("message", "No users available");
			return "usrmsg.jsp";
		}else {
			model.addAttribute("users", users);
			return "allusers.jsp";
		}
	}
	
	@PostMapping("findMember")
	public String findMember(ModelMap model, @RequestParam("phone") String phone) {
		Member member = memberService.findMember(phone);
		if(member != null) {
			model.addAttribute("member", member);
			return "amember.jsp";
		}else {
			model.addAttribute("message", "No such member");
			return "membererr.jsp";
		}
	}
	
	@PostMapping("updateMember")
	public String updateMember(ModelMap model, @RequestParam("phone") String phone, @RequestParam("status") String status) {
		Member member = memberService.findMember(phone);
		member.setMemberStatus(status);
		model.addAttribute("message", "Member status Updated");
		return "membererr.jsp";
	}
	
	@PostMapping("removeMember")
	public String removeMember(ModelMap model, @RequestParam("accountNo") String accountNo) {
		Member member = memberService.findByAccountNo(accountNo);
		if(member == null) {
			model.addAttribute("message", "No such member");
			return "membererr.jsp";
		}else if(!loanService.allLoansByMember(member).isEmpty() || !depositService.allDepositsByMember(member).isEmpty()) {
			model.addAttribute("message", "Cant Delete already active member");
			return "membererr.jsp";
		}else {
			memberService.removeMember(member);
			model.addAttribute("message", "Member successfully removed");
			return  "membererr.jsp";
		}
	}
	
	@PostMapping("allMembers")
	public String allMembers(ModelMap model) {
		List<Member> allmembs = memberService.allMembers();
		if(allmembs.isEmpty()) {
			model.addAttribute("message", "No member in records");
			return "membererr.jsp";
		}else {
			model.addAttribute("members", allmembs);
			return "allmembers.jsp";
		}
	}
	
	@PostMapping("makePayment")
	public String makePayment(ModelMap model, @RequestParam("scheduleID") String scheduleID,
			@RequestParam("amount") String amount) {
		LoanSchedule ls = loanScheduleService.getSchedule(Integer.parseInt(scheduleID));
		if(ls != null) {
		ls.setPaidAmount(Double.parseDouble(amount));
		ls.setPaymentStatus("paid");
		Member member = ls.getLoan().getMember();
		member.setMemberBalance(member.getMemberBalance() + ls.getPaidAmount());
		model.addAttribute("message", "Payment Successful");
		return "loanerr.jsp";
		}else {
			model.addAttribute("message", "No such Schedule ID");
			return "loanerr.jsp";
		}
	}
	
}
