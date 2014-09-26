package edu.suny.np.oop.soda;

import java.util.ArrayList;

import edu.suny.np.exceptions.IllegalInputException;


public class InputTransaction extends Transaction {
		
	public InputTransaction(SodaMachine sm) {
		super(sm);
		this.name = "Input Transaction";
		
		legalInputs.add("a");
		legalInputs.add("5");
		legalInputs.add("10");
		legalInputs.add("25");
		legalInputs.add("s0");
		legalInputs.add("s1");
		legalInputs.add("s2");
		legalInputs.add("s3");
		legalInputs.add("s4");
		legalInputs.add("s5");
	}
	
	public void entry() {
		System.out.println("\n=====================================================");
		System.out.println("Insert coins (5, 10 or 25) and select the soda option");
		System.out.println("=====================================================\n");
		System.out.println("s0 - Select Soda 0");
		System.out.println("s1 - Select Soda 1");
		System.out.println("s2 - Select Soda 2");
		System.out.println("s3 - Select Soda 3");
		System.out.println("s4 - Select Soda 4\n");
		mSodaMachine.displayAmountEntered();
		System.out.println("\nInput: ");
		
	}
	public void run() {
		entry();
		String input = "";
		try {
			input = mSodaMachine.consumeInput(legalInputs);
		} catch (IllegalInputException e) {
			mSodaMachine.resetTransaction();
		}

		if (input.equals("a")) {
			mSodaMachine.getTransaction(Transaction.ADMIN_TID);
		} else if (input.equals("5") || input.equals("10") || input.equals("25")) {
			mSodaMachine.accumulateChange(input);
			mSodaMachine.getTransaction(Transaction.INPUT_TID);
		} else if (legalInputs.contains(input)){
			mSodaMachine.saveSelection(input);
			mSodaMachine.getTransaction(SELECT_TID);
		} else {
			mSodaMachine.resetMachine();
		}
	}
}
