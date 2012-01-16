/**
 * 
 */
package com.samples.tdd.bank.exception;

/**
 * Exception emitted on threshold overflow on <code>BankAccount.debit()</code> operation.
 * @author Frédéric Delorme<frederic.delorme@gmail.com>
 * @see com.samples.tdd.bank.BankAccount#debit(double)
 *
 */
public class BankAccountTresholdOverflowException extends Exception {

	/**
	 * default auto-generated Serialization Unique ID.
	 */
	private static final long serialVersionUID = -3781400530800001356L;

	/* (non-Javadoc)
	 * @see java.lang.Throwable#getMessage()
	 */
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return super.getMessage();
	}

}
