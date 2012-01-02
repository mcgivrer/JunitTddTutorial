/**
 * 
 */
package com.samples.tdd.balance;

/**
 * BalanceAccount Entity definition.
 * @author Frédéric Delorme<frederic.delorme@gmail.com>
 * @see com.samples.tdd.test.balance.BalanceAccountShouldHaveTo
 *
 */
public class BalanceAccount {
	/**
	 * Value for this BalanceAccount.
	 */
	private Double value;
	
	/**
	 * Initialization of the instance with default 0.0 value.
	 */
	public BalanceAccount(){
		value=0.0;
	}
	
	/**
	 * Return BalanceAccount value.
	 * @return
	 */
	public Double getValue() {
		// TODO Auto-generated method stub
		return value;
	}

}
