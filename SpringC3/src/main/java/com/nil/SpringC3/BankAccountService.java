package com.nil.SpringC3;

public interface BankAccountService {
	double widthdraw(long accountId,double balance);
	double deposit(long accountId,double balance);
	double getBalance(long accountId);

}
