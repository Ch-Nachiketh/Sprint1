package com.capgemini.pecuniafinance.dao;

import com.capgemini.pecuniafinance.bean.TransactionUsingSlip;

public interface TransactionDao {
	public boolean addAcountDetails(TransactionUsingSlip accountDetails);
	public boolean creditUsingSlip(String userName,String accountNumber ,double amount);
	public boolean debitUsingSlip(String userName,String accountNumber ,double amount);
	public int getBalanceById(String accountNumber);
	public boolean updateAccountBalance(TransactionUsingSlip accountDetails,double amount);
	public boolean addAmount(String accountNumber,double amount);
	public boolean deductAmount(String accountNumber,double amount);

}
