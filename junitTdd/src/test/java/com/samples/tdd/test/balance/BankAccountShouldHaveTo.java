/**
 * 
 */
package com.samples.tdd.test.balance;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.samples.tdd.balance.BankAccount;


/**
 * Test Case implementation for the BankAccount Entity creation.
 * @author Frédéric Delorme<frederic.delorme@gmail.com>
 *
 */
public class BankAccountShouldHaveTo {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * UC1: Verify if BankAccount is initialized with a 0.0 value.
	 */
	@Test
	public void beInitializedWithAZeroValue() {
		BankAccount ba = new BankAccount();
		assertEquals("BankAccount is not initialized with a Zero default value !",Double.valueOf(0.0),ba.getValue());
	}

}
