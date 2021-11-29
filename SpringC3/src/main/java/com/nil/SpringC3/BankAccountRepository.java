package com.nil.SpringC3;

public interface BankAccountRepository {
	double getBalance(long accountID);
	double updateBalance(long accountID,double newBalance);


}
