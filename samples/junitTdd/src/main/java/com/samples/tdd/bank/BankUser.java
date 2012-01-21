/**
 * 
 */
package com.samples.tdd.bank;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author FDELORME
 *
 */
public class BankUser {
	/**
	 * Prénom de l'utilisateur bancaire.
	 */
	public String firstname;
	/**
	 * Nom de l'utilisateur bancaire.
	 */
	public String lastname;
	/**
	 * date de naissance de l'utilisateur bancaire.
	 */
	public Date birthDate;
	private List<BankAccount> bankAccountsList;

	/**
	 * Default Contructor
	 */
	public BankUser(){
		firstname="";
		lastname="";
		birthDate=new Date();
		bankAccountsList=new ArrayList<BankAccount>();
	}
	
	/**
	 * Parameterized constructor.
	 * @param firstname
	 * @param lastname
	 * @param birthdate
	 */
	public BankUser(String firstname, String lastname, Date birthdate){
		this.firstname=firstname;
		this.lastname=lastname;
		this.birthDate=birthdate;
	}

	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/**
	 * @return the birthDate
	 */
	public Date getBirthDate() {
		return birthDate;
	}

	/**
	 * @param birthDate the birthDate to set
	 */
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	/**
	 * Attach the <code>BankAccount ba</code> to this <code>BankUser</code>.
	 * @param ba
	 */
	public void addBankAccount(BankAccount ba) {
		this.bankAccountsList.add(ba);		
	}

	/**
	 * Return the <code>List&lt;BankAccount&gt;</code> attached to this BankUser..
	 * @return the list of BankAccount attached to this Bank User.
	 */
	public List<BankAccount> getBankAccountList() {
		return bankAccountsList;
	}

	/**
	 * return the <code>BankAccount</code> entity corresponding to the provider <code>accountNumber</code>.
	 * @param accountNumber to be retrieve on this BankUser.
	 * @return the corresponding BankAccount. 
	 */
	public BankAccount getAccountNumber(String accountNumber) {
		for (BankAccount item : bankAccountsList) {
			if(item.getAccountNumber().equals(accountNumber)){
				return item;
			}
		}
		return null;
	}
	
}
