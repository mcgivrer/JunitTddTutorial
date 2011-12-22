/**
 * 
 */
package com.samples.tdd.balance;

/**
 * @author frederic
 *
 */
public class BalanceAccount {
	private Double accountValue = 0.0;
	public Double getBalance() {
		// TODO Auto-generated method stub
		return  accountValue;
	}
	public void setValueAccount(double d) {
		// TODO Auto-generated method stub
		accountValue=d;
	}
	public void credit(double d) {
		// TODO Auto-generated method stub
		accountValue+=d;
	}
	public void debit(double d) {
		// TODO Auto-generated method stub
		accountValue-=d;
	}
 
	
}
