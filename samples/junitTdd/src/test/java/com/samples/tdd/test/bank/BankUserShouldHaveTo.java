package com.samples.tdd.test.bank;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.samples.tdd.bank.BankAccount;
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

	/**
	 * Verify if BankUser is clearly initialized.
	 */
	@Test
	public void beInitializedWithFirstNameLastNameBirthDateEmpty(){
		assertEquals("BankUser has no Firstname initialized","",bu.getFirstname());
		assertEquals("BankUser has no Lastname initialized","",bu.getLastname());
		assertEquals("BankUser has no birthDate initialized",new Date().toString(),bu.getBirthDate().toString());
	}
	
	@Test
	public void beCreatedWithParameters(){
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			bu = new BankUser("Frédéric","Delorme",sdf.parse("02/02/1973"));
		} catch (ParseException e) {
			fail("Can't parse birthdate on provided string");
		}
		
		assertEquals("BankUser was not intialized with Frédéric","Frédéric",bu.getFirstname());
		assertEquals("BankUser was not intialized with Delorme","Delorme",bu.getLastname());
		try {
			assertEquals("BankUser was not intialized with Frédéric",sdf.parse("02/02/1973"),bu.getBirthDate());
		} catch (ParseException e) {
			fail("Can't parse birthdate on provided string");
		}
		
	}
	
	@Test
	public void beLinkedToOneBankAccountAtLeast(){
		BankAccount ba = new BankAccount(1000.0);
		bu.addBankAccount(ba);
		assertEquals("BankUser has not been added with one BankAccount",1, bu.getBankAccountList().size());
		
	}

	@Test
	public void returnOneAccountOnItsAccountNumber(){
		BankAccount ba = new BankAccount(1000.0);
		bu.addBankAccount(ba);
		
		// retrieve BankAccount on it's account number.
		BankAccount rep = bu.getAccountNumber(ba.getAccountNumber());
		
		assertEquals("BankUser has not been linked to "+ba.getAccountNumber()+" account Number",ba,rep);
	}
	
}
