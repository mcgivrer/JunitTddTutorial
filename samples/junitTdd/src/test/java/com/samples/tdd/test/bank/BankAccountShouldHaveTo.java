/**
 * 
 */
package com.samples.tdd.test.bank;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.samples.tdd.bank.BankAccount;
import com.samples.tdd.bank.exception.BankAccountNegativeCreditException;
import com.samples.tdd.bank.exception.BankAccountPositiveDebitException;
import com.samples.tdd.bank.exception.BankAccountTresholdOverflowException;

/**
 * Test Case implementation for the <code>BankAccount</code> Entity creation.
 * @author Frédéric Delorme<frederic.delorme@gmail.com>
 *
 */
public class BankAccountShouldHaveTo {
	
	/**
	 * BankAccount instance used throught mainly all test.
	 */
	private BankAccount ba;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		ba = new BankAccount();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void beInitializedWithAZeroValue() {
		assertEquals("BankAccount is not initialized " 
					+ "with a Zero default value !",
					Double.valueOf(0.0),ba.getValue());
	}

	@Test
	public void beCreditedWithAPositiveValue(){
		try{

			ba.credit(1000.0);
			assertEquals("BankAccount is not credited with 1000.0 bucks !", 
						Double.valueOf(1000.0), ba.getValue());
			
			ba.credit(-500.0);
			assertEquals("BankAccount was credited with a negative value !", Double.valueOf(500.0),ba.getValue());
		}catch (Exception e ){
			if(!(e instanceof BankAccountNegativeCreditException)){
				fail("BankAccount throw wrong exception for negative credit value");
			}
		}
	}
	
	@Test
	public void beDebitedWithANegativeValue(){
		try{
			ba.setValue(1000.0);
			ba.debit(-200.0);
			assertEquals("BankAccount is not debited with 200.0 bucks !", 
						Double.valueOf(800.0), ba.getValue());
			ba.debit(200.0);
			assertEquals("BankAccount was debited with a positive value !", Double.valueOf(-200.0),ba.getValue());
		}catch (Exception e ){
			if(!(e instanceof BankAccountPositiveDebitException)){
				fail("BankAccount throw wrong exception for positive debit value");
			}
		}
	}

	@Test
	public void beInitializedWithAZeroThreshold(){
		assertEquals("BankAccount default threshold value is not set to 0",Double.valueOf(0.0), ba.getThreshold());
	}

	@Test
	public void beInstanciateWithValueAndThresholdDefaultValue(){
		BankAccount ba = new BankAccount(1000.0,-500.0);
		assertEquals("BankAccount value was not set to 1000.0 initial value.",Double.valueOf(1000.0),ba.getValue());
		assertEquals("BankAccount threshold was not set to -500.0 initial value.",Double.valueOf(-500.0),ba.getThreshold());
	}

	
	@Test
	public void beInstanciateWithADefaultValue(){
		ba = new BankAccount(1000.0);
		assertEquals("BankAccount default value was not set to 1000.0 at instanciation time"
				, Double.valueOf(1000.0),ba.getValue());
	}

	@Test
	public void beThresholdOnDebitOperation(){
		ba = new BankAccount(1000.0);
		ba.setThreshold(-500.0);
		assertEquals("BankAccount Threshold was not set to 2000.0 bucks !", 
						Double.valueOf(-500.0),ba.getThreshold());
		ba.setValue(1500.0);
		try {
			ba.debit(-2500.0);
			assertEquals("BankAccount threshold exception was not emitted !",Double.valueOf(0.0),ba.getThreshold());
		} catch (BankAccountPositiveDebitException pde) {
			fail("BankAccount debit error !");
		} catch (BankAccountTresholdOverflowException toe) {
			if(!(toe instanceof BankAccountTresholdOverflowException)){
				fail("BankAccount emit wrong exception on threshold overflow.");
			}
		}
	}

	@Test
	public void notBeThresholdOnAuthorizedDebitOperation(){
		ba = new BankAccount(1000.0);
		try{
			ba.debit(-200.0);
			assertEquals("BankAccount threshold exception was not emitted !",Double.valueOf(0.0),ba.getThreshold());
		}catch(Exception e){
			
			if(!(e instanceof BankAccountTresholdOverflowException)){
				fail("BankAccount emit wrong exception on threshold overflow.");
			}
		}
	}
}