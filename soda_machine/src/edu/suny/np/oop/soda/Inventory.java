package edu.suny.np.oop.soda;

import java.util.*;

import edu.suny.np.exceptions.*;

public class Inventory {

	public static String COLA = "cola";
	public static String ORANGE = "orange";
	public static String SPRITE = "sprite";
	public static String GINGER_ALE = "ginger ale";
	public static String DIET_COLA = "cola";
	private int selection = 0;
	
	private ArrayList<InventoryItem> contents = new ArrayList<InventoryItem>();
	
	public Inventory() {
		InventoryItem cola = new InventoryItem(0, COLA, 0);
		InventoryItem orange = new InventoryItem(1, ORANGE, 0);
		InventoryItem sprite = new InventoryItem(2, SPRITE, 0);
		InventoryItem gignerAle = new InventoryItem(3, GINGER_ALE, 0);
		InventoryItem dietCola = new InventoryItem(4, DIET_COLA, 0);
		
		contents.add(cola);
		contents.add(orange);
		contents.add(sprite);
		contents.add(gignerAle);
		contents.add(dietCola);
	}
	
	public void addToInventory(int id, int q ) throws InvalidQuantityException {
		try {
			contents.get(id).addToInventory(q);
		} catch (FullStockException e) {
			e.printStackTrace();
		} catch (InvalidQuantityException e) {
			e.printStackTrace();
		} catch (Exception e){
			System.out.println("Add by int to inventory error.");
		}
	}
	
	public void addToInventory(String  n, int q) {
		try {
			InventoryItem inventoryItem = this.getInventoryItem(n); 
			inventoryItem.addToInventory(q);
		} catch (FullStockException e) {
			e.printStackTrace();
		} catch (Exception e){
			System.out.println("Add by strign to inventory error.");
		}
	}
	
	public String toString() {
		String output = new String();

		for (int i = 0; i < contents.size() - 1; i++) {
			output += "(" + i + ")" + ": " + contents.get(i).getName() + " - " + contents.get(i).getQIS() + ", "; 
		}
		output = output.substring(0,output.length()-2);
		return output;
	}
	
	public InventoryItem getInventoryItem(String s) throws InventoryItemNotFoundException {
		InventoryItem searchResults = null;
		for(InventoryItem item : contents){
			if (item.getName().equals(s)) {
				searchResults = item;
			}
		}
		if (searchResults != null) {
			return searchResults;
		} else {
			throw new InventoryItemNotFoundException("Item not available in the contents list.");
		}
	}
	
	public boolean insufficientFunds(int item, int amountEntered) {
		InventoryItem inventoryItem = contents.get(item);
		if(amountEntered < inventoryItem.getPrice()){
			return true;
		}else{
			return false;
		}
	}
	
	public String getItemName(int i) {
		return contents.get(i).getName();
	}
	
//	private InventoryItem getItem(int i) {
//	}
//	
//	private InventoryItem getItem(String i) {
//				
//	}
//	
//	public boolean outOfStock(int itemID) {
//	}
//	
//	public int getSelectionCost(int selection) {
//	}
//	
//	public String getSelection(int selection) {
//	}
	
	public void updateInventory(String s) {
		
	}
	
	public static void main(String[] args) {
		Inventory inventory = new Inventory();

		System.out.println(inventory.toString());;
	}
	
}
