package edu.suny.np.oop.soda;

import java.util.ArrayList;
import java.util.Scanner;

import edu.suny.np.exceptions.IllegalInputException;
import edu.suny.np.exceptions.InvalidCoinException;
import edu.suny.np.exceptions.InvalidTransactionIdException;

public class SodaMachine {

	public static Transaction transaction;
	private static ArrayList<Transaction> transactions = new ArrayList<Transaction>();
	private Scanner scan;
	private Inventory inventory = null;
	private ChangeMechanism changeMechanism;
	private String latestSelection = null;
	
	
	public SodaMachine() {
	}
	
	public void  processSelection() {
	}
	
	public void resetTransaction() {
		transaction = transactions.get(Transaction.INIT_TID);
	}
	
	public Transaction getTransaction(int t){
		if (t >= 0 && t <=4) {
			return transaction = transactions.get(t);
		}else {
			return null;
		}
	}
	
	public void advanceTransaction(int tid) {
		this.getTransaction(tid);
	}
	
	public void saveSelection(String s) {
		latestSelection = s;
	}
	
	public void addTransactions(SodaMachine sm) {
		Transaction initialTransaction = new InitTransaction(sm);
		transactions.add(Transaction.INIT_TID, initialTransaction);
		Transaction adminTransaction = new AdminTransaction(sm);
		transactions.add(Transaction.ADMIN_TID, adminTransaction);
		Transaction selectTransaction = new SelectTransaction(sm);
		transactions.add(Transaction.SELECT_TID, selectTransaction);
		Transaction inputTransaction = new InputTransaction(sm);
		transactions.add(Transaction.INPUT_TID, inputTransaction);
	}
	/**
	 * @param args - the legal inputs in this state
	 * this method gets input, checks it against legal
	 * inputs and returns input if legal; otherwise
	 * it returns the null string.
	 * @throws IllegalInputException 
	 * 
	 */
	public String consumeInput(ArrayList<String> args) throws IllegalInputException {
		scan = new Scanner(System.in);
		String input = scan.next(); 
		if (args.contains(input)) {
			return input;
		} else {
			throw new IllegalInputException("Illegal input.");
		}
	}
	
	public void accumulateChange(String s) {
		try {
			changeMechanism.addChange(s);
		} catch (InvalidCoinException e) {
			e.printStackTrace();
		}
	}
	
	public void displayMachineInfo() {
		System.out.println("Amount inserted (cents): " + changeMechanism.getAmountEntered());
	}
	
	public void initMachine() {
		latestSelection = null;
		
	}
	
	public void removeMachineReceipts() {
		changeMechanism.emptyCashBox();
	}
	
	public void addToInventory(String s) {
		inventory.addToInventory(s, 1);
	}
	
	public static void main(String[] args) {
		SodaMachine sm = new SodaMachine();
		sm.addTransactions(sm);
		transaction = transactions.get(Transaction.INIT_TID);
		while(true) {
			SodaMachine.transaction.run();
		}
	}

}
