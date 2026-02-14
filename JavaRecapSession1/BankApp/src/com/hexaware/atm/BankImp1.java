package com.hexaware.atm;
/*
 * @author: Jeethu
 * Desp:  deposit() implementation
 * 
 */
public abstract class BankImp1 implements IBank{

	@Override
	public void deposit() {

		System.out.println("Deposit successfully..");
		
	}

	public abstract void withdraw();
}
