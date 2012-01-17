/**
 * 
 */
package com.samples.tdd.bank.exception;

/**
 * Exception thrown on Positive value input to <code>BankAccount.debit()</code> method.
 * @author Frédéric Delorme<frederic.delorme@gmail.com>
 * @see com.samples.tdd.bank.BankAccount#debit(double)
 *
 */
public class BankAccountPositiveDebitException extends Exception{

	/**
	 * default auto-generated Serialization Unique ID.
	 */
	private static final long serialVersionUID = -685229677548773214L;

	/* (non-Javadoc)
	 * @see java.lang.Throwable#getMessage()
	 */
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Positive Debit is not allowed.";
	}

}
