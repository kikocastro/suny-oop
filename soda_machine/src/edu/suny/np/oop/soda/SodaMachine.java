package edu.suny.np.oop.soda;

import java.util.ArrayList;
import java.util.Scanner;

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
	
	public Transaction getTransaction(int t) throws InvalidTransactionIdException {
		if (t >= 0 && t <=4) {
			System.out.println(transactions.get(t).name);
			return transaction = transactions.get(t);
		}else {
			throw new InvalidTransactionIdException("Could not get transaction. Invalid transaction ID.");
		}
	}
	
	public void advanceTransaction(int tid) {
		try {
			this.getTransaction(tid);
		} catch (InvalidTransactionIdException e) {
			e.printStackTrace();
		}
		System.out.println(transaction.ID);
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
	 * 
	 */
	public String consumeInput(ArrayList<String> args) {
		System.out.println("enter an integer");
		scan = new Scanner(System.in);
		args.add(scan.next());
		return "?";
	}
	
	public void accumulateChange(String s) {
		try {
			changeMechanism.addChange(s);
		} catch (InvalidCoinException e) {
			e.printStackTrace();
		}
	}
	
//	public void displayMachineInfo() {
//	}
	
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
