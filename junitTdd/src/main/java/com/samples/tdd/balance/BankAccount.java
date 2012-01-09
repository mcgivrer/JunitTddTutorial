/**
 * 
 */
package com.samples.tdd.balance;

/**
 * BankAccount Entity definition.
 * @author Frédéric Delorme<frederic.delorme@gmail.com>
 * @see com.samples.tdd.test.balance.BankAccountShouldHaveTo
 *
 */
public class BankAccount {
	/**
	 * Value for this BankAccount.
	 */
	private Double value;
	
	/**
	 * Initialization of the instance with default 0.0 value.
	 */
	public BankAccount(){
		value=0.0;
	}
	
	/**
	 * Return BankAccount value.
	 * @return
	 */
	public Double getValue() {
		// TODO Auto-generated method stub
		return value;
	}

}
