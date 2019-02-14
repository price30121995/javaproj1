package com.nt.service;

import java.util.Calendar;

public class BankService {
public String ApproveLoan(int loanid,String manager,int amount) {
	Calendar cal=null;
	int month=0;
	//system date 
	cal=cal.getInstance();
	//get current month
	month=cal.get( Calendar.MONTH);
	System.out.println(month);
	if((month>=1 && month<=11) && amount<=100000){
		return  loanid +"Loan is approved with "+amount +"by manager::"+manager;
	}
	else{
		return loanid +"Loan is not approved with "+amount +"by manager::"+manager;
}
}
}