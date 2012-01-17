/**
 * 
 */
package com.samples.tdd.bank;

import com.samples.tdd.bank.exception.BankAccountNegativeCreditException;
import com.samples.tdd.bank.exception.BankAccountPositiveDebitException;
import com.samples.tdd.bank.exception.BankAccountTresholdOverflowException;

/**
 * Bank Account implementation driven by test from <code>BankAccountShouldHaveTo</code>
 * @see com.samples.tdd.test.bank.BankAccountShouldHaveTo
 * @author Frédéric Delorme<frederic.delorme@gmail.com>
 *
 */
public class BankAccount {
	/**
	 * Value for this BankAccount.
	 */
	private Double value;
	/**
	 * BankAccount threshold value.
	 */
	private double threshold;
	
	/**
	 * Initialization of the instance with default 0.0 value.
	 */
	public BankAccount(){
		initialize();
	}
	
	/**
	 * Internal Initialization for BankAccount attributes.
	 */
	private void initialize(){
		value=0.0;
		threshold = 0.0;
	}
	
	/**
	 * Parameterized constructor for default <code>value</code>.
	 * @param defaultValue
	 */
	public BankAccount(double defaultValue) {
		initialize();
		value=defaultValue;
	}

	/**
	 * Parameterized constructor for default <code>value</code> and <code>threshold</code>.
	 * @param defaultValue
	 * @param defaultThreshold
	 */
	public BankAccount(double defaultValue, double defaultThreshold) {
		initialize();
		value = defaultValue;
		threshold=defaultThreshold;
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

	/**
	 * Debit <code>debitValue</code> bucks from the BankAccount value.
	 * @param debitValue
	 * @throws BankAccountPositiveDebitException
	 * @throws BankAccountTresholdOverflowException 
	 */
	public void debit(double debitValue) throws BankAccountPositiveDebitException, BankAccountTresholdOverflowException {
		if(debitValue>0){
			throw new BankAccountPositiveDebitException();
		}else if((value+debitValue)<threshold){
				throw new BankAccountTresholdOverflowException();
		}else{
			value+=debitValue;
		}
	}
	/**
	 * Set BankAccount <code>threshold</code> value.
	 * @param threshold
	 */
	public void setThreshold(double thresholdValue) {
		this.threshold = thresholdValue; 
	}

	/**
	 * return the value of the <code>threshold</code> for this BankAccount.
	 * @return
	 */
	public Double getThreshold() {
		return threshold;
	}
	/**
	 * Set the default <code>value</code> for the BankAccount.
	 * @param d
	 */
	public void setValue(double value) {
		this.value = value;
	}

}

