package edu.suny.np.oop.soda;

import java.util.StringTokenizer;

import edu.suny.np.exceptions.IllegalInputException;


public class AdminTransaction extends Transaction {
	
	public AdminTransaction(SodaMachine sm) {
		super(sm);
		this.name = "Admin Transaction";
		
		legalInputs.add("q");
		legalInputs.add("R");
		legalInputs.add("r0");
		legalInputs.add("r1");
		legalInputs.add("r2");
		legalInputs.add("r3");
		legalInputs.add("r4");
	}
	
	public void entry() {
		System.out.println("\n     .   .   .   .   .   .   .   .   Admin mode   .   .   .   .   .   .   .   .\n");
		mSodaMachine.displayMachineInfo();
		System.out.println("===============================================\n");
		System.out.println("q - Quit admin mode");
		System.out.println("R - Remove coins");
		System.out.println("r0 - Refill soda 0");
		System.out.println("r1 - Refill soda 1");
		System.out.println("r2 - Refill soda 2");
		System.out.println("r3 - Refill soda 3");
		System.out.println("r4 - Refill soda 4\n");
		System.out.println("Enter option:");
	}
	public void run() {
		entry();
		String input = null;
		try {
			input = mSodaMachine.consumeInput(legalInputs);
		} catch (IllegalInputException e) {
			System.out.println("Invalid input!\n");
			mSodaMachine.getTransaction(Transaction.ADMIN_TID);
		}
		
		if (input.equals("q")) {
			mSodaMachine.resetTransaction();
		} else if (input.equals("R")) {
			mSodaMachine.removeMachineReceipts();
		} else {
			mSodaMachine.addToInventory(input);
		}

	}
}
