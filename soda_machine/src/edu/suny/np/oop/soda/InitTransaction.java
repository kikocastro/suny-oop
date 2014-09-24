package edu.suny.np.oop.soda;

import java.util.*;

public class InitTransaction extends Transaction{

	public InitTransaction(SodaMachine sm) {
		super(sm);
		this.name = "InitTransaction";
	}
	
	public void entry() {
		System.out.println("Initialized.");
	}
	
	public void run() {
		entry();
		mSodaMachine.advanceTransaction(Transaction.INPUT_TID);
	}
}
