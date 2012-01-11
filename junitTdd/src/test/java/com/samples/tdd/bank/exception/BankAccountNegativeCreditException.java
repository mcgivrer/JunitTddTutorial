/**
 * 
 */
package com.samples.tdd.bank.exception;

/**
 * Exception thrown on Negative value input to BankAccount.credit() method.
 * @author FDELORME
 *
 */
public class BankAccountNegativeCreditException extends Exception {

	/**
	 * 
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
