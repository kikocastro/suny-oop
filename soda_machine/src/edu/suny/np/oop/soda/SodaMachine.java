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

	private Inventory inventory = null;
	private ChangeMechanism changeMechanism;
	private String latestSelection = null;

	public SodaMachine() {
		changeMechanism = new ChangeMechanism();
		inventory = new Inventory();
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
						output += "Problems with change.";
					}// successful purchase
					else{
						inventory.decrement(item);
						output = "Pick your " + latestSelection;
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
	
	public String getCashBox(){
		return Integer.toString(changeMechanism.getCashbox());
	}
	
	public int[] getInventoryQIS(){
		return inventory.getQIS();
	}
	
	public int[] getInventoryPrices(){
		return inventory.getPrices();
	}

	public void resetMachine() {
		latestSelection = null;
		changeMechanism.resetAmountEntered();
	}

	public void remax() {
		changeMechanism.remax();
	}

	public void cancelPurchase() {
		changeMechanism.cancelPurchase();
	}
	
	public String getChange(){
		return changeMechanism.getChange();
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
	
	public void updateInventory(String s){
		try {
			inventory.updateInventory(s);
		} catch (FullStockException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
