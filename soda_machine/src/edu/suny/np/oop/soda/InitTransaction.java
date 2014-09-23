package edu.suny.np.oop.soda;

import java.util.*;

public class InitTransaction extends Transaction{

	public InitTransaction(SodaMachine sm) {
		super(sm);
		this.name = "InitTransaction";
	}
	
	public void entry() {
	}
	
	public void run() {
		entry();
		mSodaMachine.advanceTransaction(Transaction.INPUT_TID);
	}
}
