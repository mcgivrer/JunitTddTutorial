/**
 * 
 */
package com.samples.tdd.bank;

import com.samples.tdd.bank.exception.BankAccountNegativeCreditException;

/**
 * Bank Account implementation driven by test from BankAccountShouldHaveTo
 * @see com.samples.tdd.test.bank.BankAccountShouldHaveTo
 * @author FDELORME
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
	/**
	 * Credit <code>creditValue</code> bucks to the BankAccount value.
	 * @param creditValue
	 * @throws BankAccountNegativeCreditException 
	 */
	public void credit(double creditValue) throws BankAccountNegativeCreditException {
		if(creditValue<0){			
			throw new BankAccountNegativeCreditException();
		}
		value+=creditValue;
	}

}
