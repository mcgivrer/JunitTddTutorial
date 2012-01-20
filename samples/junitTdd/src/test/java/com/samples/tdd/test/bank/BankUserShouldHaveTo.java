package com.samples.tdd.test.bank;


import org.junit.After;
import org.junit.Before;

import com.samples.tdd.bank.BankUser;

/**
 * Test Case implementation for the <code>BankUser</code> Entity creation.
 * @author Frédéric Delorme<frederic.delorme@gmail.com>
 */
public class BankUserShouldHaveTo {

	/**
	 * Entity used for test execution.
	 */
	private BankUser bu;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		bu = new BankUser();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		bu = null;
	}

}
