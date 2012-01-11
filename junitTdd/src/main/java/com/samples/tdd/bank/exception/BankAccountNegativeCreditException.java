/**
 * 
 */
package com.samples.tdd.bank.exception;

/**
 * Exception thrown on Negative value input to <code>BankAccount.credit()</code> method.
 * @author FDELORME
 * @see com.samples.tdd.bank.BankAccount#credit(double)
 *
 */
public class BankAccountNegativeCreditException extends Exception {

	/**
	 * default auto-generated Serialization Unique ID.
	 */
	private static final long serialVersionUID = -645567821894120585L;

	/* (non-Javadoc)
	 * @see java.lang.Throwable#getMessage()
	 */
	@Override
	public String getMessage() {
		return super.getMessage();
	}

}
