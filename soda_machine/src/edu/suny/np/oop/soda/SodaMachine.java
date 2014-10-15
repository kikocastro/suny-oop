package edu.suny.np.oop.soda;

import java.util.ArrayList;
import java.util.Scanner;

import edu.suny.np.exceptions.EmptyStockException;
import edu.suny.np.exceptions.FullStockException;
import edu.suny.np.exceptions.IllegalInputException;
import edu.suny.np.exceptions.InvalidCoinException;
import edu.suny.np.exceptions.InvalidQuantityException;
import edu.suny.np.exceptions.InvalidTransactionIdException;
import edu.suny.np.exceptions.InventoryItemNotFoundException;

public class SodaMachine {

	public static Transaction transaction;
	private static ArrayList<Transaction> transactions = new ArrayList<Transaction>();
	private Scanner scan;
	private Inventory inventory = null;
	private ChangeMechanism changeMechanism;
	private String latestSelection = null;
	
	
	public SodaMachine() {
		changeMechanism = new ChangeMechanism();
		inventory = new Inventory();
		scan = new Scanner(System.in);
	}
	
	public void processSelection() {
		InventoryItem item = inventory.getItemFromContents(latestSelection);
		int selectionCost = inventory.getSelectionCost(item.getId());
		if (inventory.outOfStock(item.getId())) {
			System.out.println("Out of stock.");
			resetTransaction();
		}else {
			if (inventory.insufficientFunds(latestSelection, changeMechanism.getAmountEntered())) {
				System.out.println("Insufficient funds.");
				resetTransaction();
			} else {
				if (selectionCost > changeMechanism.getAvailableChange()) {
					System.out.println("Machine out of change.");
					resetTransaction();
				} else {
					try {
						item.decrementInventory();
					} catch (EmptyStockException e) {
						e.printStackTrace();
					}
					String change = changeMechanism.getChange(selectionCost);
					System.out.println("Pick your soda.");
					if(!change.contentEquals("Change: 0 cents.")){
						System.out.println(change);
					}
					resetMachine();
				}
			}
		}
	}
	
	public void resetMachine(){
		latestSelection = null;
		changeMechanism.resetAmountEntered();
	}
	
	public void resetTransaction() {
		System.out.println("Purchase cancelled. Returned amount: " + changeMechanism.getAmountEntered() + " cents");
		changeMechanism.cancellPurchase();
		transaction = transactions.get(Transaction.INPUT_TID);
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
		if (s.equals("s0")) {
			latestSelection = inventory.getItemName(0);
		} else if (s.equals("s1")) {
			latestSelection = inventory.getItemName(1);
		} else if (s.equals("s2")) {
			latestSelection = inventory.getItemName(2);
		} else if (s.equals("s3")) {
			latestSelection = inventory.getItemName(3);
		} else if (s.equals("s4")) {
			latestSelection = inventory.getItemName(4);
		} 
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
		
		String input = scan.next(); 
		if (args.contains(input)) {
			return input;
		} else {
			throw new IllegalInputException("Illegal input.");
		}
	}
	
	public void accumulateChange(String s) {
		try {
			changeMechanism.addChange(Integer.parseInt(s));
		} catch (InvalidCoinException e) {
			e.printStackTrace();
		}
	}
	
	public void displayMachineInfo() {
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println(inventory.toString());
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("\nCashbox: " + changeMechanism.getCashbox());
		System.out.println("Available change: " + changeMechanism.getAvailableChange());
		System.out.println("Coins stack: " + changeMechanism.toString());
	}
	
	public void displayAmountEntered() {
		System.out.println("Amount entered (cents): " + changeMechanism.getAmountEntered());
	}
	
	public void initMachine() {
		latestSelection = null;
		changeMechanism.init();
		for (int i = 0; i < 5; i++) {
			String itemName = inventory.getItemName(i);
			try {
				inventory.updateInventory(itemName);
			} catch (FullStockException e) {
				e.printStackTrace();
				this.resetTransaction();
			}
		}
	}
	
	public void removeMachineReceipts() {
		System.out.println(changeMechanism.emptyCashBox());
	}
	
	public void addToInventory(String s) {
		try {
			inventory.addToInventory(s, 1);
		} catch (InventoryItemNotFoundException e) {
			e.printStackTrace();
			this.resetTransaction();
		} catch (FullStockException e) {
			e.printStackTrace();
			this.resetTransaction();
		} catch (InvalidQuantityException e) {
			e.printStackTrace();
			this.resetTransaction();
		}
	}
	
//	public static void main(String[] args) {
//		SodaMachine sm = new SodaMachine();
//		sm.addTransactions(sm);
//		transaction = transactions.get(Transaction.INIT_TID);
//		while(true) {
//			SodaMachine.transaction.run();
//		}
//	}

}
