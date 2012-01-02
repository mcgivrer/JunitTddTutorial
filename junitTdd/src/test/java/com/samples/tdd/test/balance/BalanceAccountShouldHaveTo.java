/**
 * 
 */
package com.samples.tdd.test.balance;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.samples.tdd.balance.BalanceAccount;


/**
 * Test Case implementation for the BalanceAccount Entity creation.
 * @author Frédéric Delorme<frederic.delorme@gmail.com>
 *
 */
public class BalanceAccountShouldHaveTo {

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

	@Test
	public void beInitializedWithAZeroValue() {
		BalanceAccount ba = new BalanceAccount();
		assertEquals("BaanceAccount is not initialized with a Zero default value !",Double.valueOf(0.0),ba.getValue());
	}

}
