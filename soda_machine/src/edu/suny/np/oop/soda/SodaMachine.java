package edu.suny.np.oop.soda;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import edu.suny.np.exceptions.EmptyStockException;
import edu.suny.np.exceptions.FullStockException;
import edu.suny.np.exceptions.IllegalInputException;
import edu.suny.np.exceptions.InvalidCoinException;
import edu.suny.np.exceptions.InvalidQuantityException;
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
		initMachine();
	}

	public String processSelection() {
		String output = "Purchase canceled. ";
		InventoryItem item = inventory.getItemFromContents(latestSelection);
		
		int selectionCost = inventory.getSelectionCost(item.getId());
		if (inventory.outOfStock(item.getId())) {
			System.out.println("Out of stock.");
			output += "Out of stock.";
			cancelPurchase();
		} else {
			if (inventory.insufficientFunds(latestSelection,
					changeMechanism.getAmountEntered())) {
				System.out.println("Insufficient funds.");
				output += "Insufficient funds.";
				cancelPurchase();
			} else {
				if (selectionCost > changeMechanism.getAvailableChange()) {
					System.out.println("Machine out of change.");
					output += "Machine out of change.";
					cancelPurchase();
				} else {
					changeMechanism.processChange(selectionCost);
					String change = changeMechanism.getChange();
					
					if(change.equals("invalid change")){
						changeMechanism.cancelPurchase();
					}// successful purchase
					else{
						inventory.decrement(item);
						System.out.println("Pick your soda.");
					}
	
					
					output = "Pick your " + latestSelection;
					if (!change.contentEquals("Change: 0 cents.")) {
						System.out.println(change);
					}
					resetMachine();
				}
			}
		}
		return output;
	}

	public Boolean hasPurchaseStarted() {
		int amountEntered = changeMechanism.getAmountEntered();
		if (amountEntered == 0) {
			return false;
		} else {
			return true;
		}
	}
	
	public int[] getInventoryQIS(){
		return inventory.getQIS();
	}

	public void resetMachine() {
		latestSelection = null;
		changeMechanism.resetAmountEntered();
	}

	public void remax() {
		changeMechanism.remax();
	}

	public String cancelPurchase() {
		return changeMechanism.cancelPurchase();
	}
	
	public String getChange(){
		return changeMechanism.getChange();
	}

	public Transaction getTransaction(int t) {
		if (t >= 0 && t <= 4) {
			return transaction = transactions.get(t);
		} else {
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
	 * @param args
	 *            - the legal inputs in this state this method gets input,
	 *            checks it against legal inputs and returns input if legal;
	 *            otherwise it returns the null string.
	 * @throws IllegalInputException
	 * 
	 */
	public String consumeInput(ArrayList<String> args)
			throws IllegalInputException {

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
		System.out
				.println("----------------------------------------------------------------------------------------");
		System.out.println(inventory.toString());
		System.out
				.println("----------------------------------------------------------------------------------------");
		System.out.println("\nCashbox: " + changeMechanism.getCashbox());
		System.out.println("Available change: "
				+ changeMechanism.getAvailableChange());
		System.out.println("Coins stack: " + changeMechanism.toString());
	}

	public String getAmountEntered() {
		String amount = Integer.toString(changeMechanism.getAmountEntered());
		return amount;
	}

	public void initMachine() {
		latestSelection = null;
		changeMechanism.remax();
		for (int i = 0; i < 5; i++) {
			String itemName = inventory.getItemName(i);
			try {
				inventory.updateInventory(itemName);
			} catch (FullStockException e) {
				e.printStackTrace();
				this.cancelPurchase();
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
			this.cancelPurchase();
		} catch (FullStockException e) {
			e.printStackTrace();
			this.cancelPurchase();
		} catch (InvalidQuantityException e) {
			e.printStackTrace();
			this.cancelPurchase();
		}
	}

	public int[] getCoinReturn() {
		return changeMechanism.getCoinReturn();
	}
	
	public void addChangeListenerInventory(ChangeListener newListener){
		inventory.addChangeListener(newListener);
	}
	
	public void addChangeListenerChangeMechanism(ChangeListener newListener){
		changeMechanism.addChangeListener(newListener);
	}
}
