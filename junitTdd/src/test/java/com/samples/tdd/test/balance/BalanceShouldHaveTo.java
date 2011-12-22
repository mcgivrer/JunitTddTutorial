/**
 * 
 */
package com.samples.tdd.test.balance;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.samples.tdd.balance.BalanceAccount;

/**
 * @author frederic
 *
 */
public class BalanceShouldHaveTo {

	private BalanceAccount balance;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {

		balance = new BalanceAccount();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void beInitializeWithZero() {
		assertEquals("BalanceAccount is not initialized " +
				"with a 0 default value", 
				new Double(0.0) ,balance.getBalance());
	}

	@Test
	public void beAbletoSetDefaultValueAccount(){
		balance.setValueAccount(1000.0);
		assertEquals("The Default Value is not set to 1000.0",new Double(1000.0),balance.getBalance());
	}
	
	@Test
	public void beAbleToCreditAccount(){
		balance.credit(500.0);
		assertEquals("The account is not credited of 500.0 bucks", new Double(500.0),balance.getBalance());
	}
	
	@Test
	public void beAbleToDebitAccount(){
		balance.setValueAccount(1000.0);
		balance.debit(500.0);
		assertEquals("Account is not subs with 500.0 bucks!",new Double(500.0), balance.getBalance());
		
	}
}
