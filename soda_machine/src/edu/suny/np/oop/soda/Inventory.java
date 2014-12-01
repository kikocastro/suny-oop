package edu.suny.np.oop.soda;

import java.util.*;

import javax.swing.event.ChangeListener;

import edu.suny.np.exceptions.*;

public class Inventory {

	public static String COLA = "cola";
	public static String ORANGE = "orange";
	public static String SPRITE = "sprite";
	public static String GINGER_ALE = "ginger ale";
	public static String DIET_COLA = "diet cola";
	private int selection = 0;
	private ArrayList<ChangeListener> listeners;
	
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
		
		listeners = new ArrayList<ChangeListener>();
	}
	
	public void addChangeListener(ChangeListener listener) {
		listeners.add(listener);
	}
	
	/**
	 * 
	 * @param id of the soda
	 * @param q quantity of sodas to be added to the inventory
	 * @throws InvalidQuantityException
	 * @throws FullStockException
	 */
	public void addToInventory(int id, int q ) throws InvalidQuantityException, FullStockException {
		contents.get(id).addToInventory(q);
	}
	/**
	 * 
	 * @param n name of the soda
	 * @param q quantity to be added
	 * @throws InventoryItemNotFoundException
	 * @throws FullStockException
	 * @throws InvalidQuantityException
	 */
	public void addToInventory(String  n, int q) throws InventoryItemNotFoundException, FullStockException, InvalidQuantityException {
		InventoryItem inventoryItem = this.getItem(n); 
		inventoryItem.addToInventory(q);
	}
	/**
	 * @return String with the available quantity of each soda:
	 * (0): cola - 1, (1): orange - 3, (2): sprite - 3, (3): ginger ale - 3, (4): diet cola - 3
	 */
	public String toString() {
		String output = new String();

		for (int i = 0; i < contents.size(); i++) {
			output += "(" + i + ")" + ": " + contents.get(i).getName() + " - " + contents.get(i).getQIS() + ", "; 
		}
		output = output.substring(0,output.length()-2);
		return output;
	}
	
	public int[] getQIS(){
		
		int[] inventoryQIS = new int[5];
		for (int i = 0; i < contents.size(); i++) {
			inventoryQIS[i] = contents.get(i).getQIS();
		}
		return inventoryQIS;
	}
	
	public InventoryItem getInventoryItem(String s) {
		return this.getItemFromContents(s);
	}
	/**
	 * Gets the inventory item that is in the contents array list
	 * @param s
	 * @return item
	 */
	public InventoryItem getItemFromContents(String s){
		for (int i = 0; i < contents.size(); i++) {
			InventoryItem item = contents.get(i);
			if (item.getName().equals(s)) {
				return item;
			}
		}
		return null;
	}
	/**
	 * Checks if the inserted amount is sufficient to buy the item
	 * @param item
	 * @param amountEntered
	 */
	public boolean insufficientFunds(String item, int amountEntered) {
		InventoryItem inventoryItem = this.getItemFromContents(item);
		if(amountEntered < inventoryItem.getPrice()){
			return true;
		}else{
			return false;
		}
	}
	
	public String getItemName(int i) {
		return contents.get(i).getName();
	}
	
	private InventoryItem getItem(int i) {
		return contents.get(i);
	}
	/**
	 *  
	 * @param i - correct input from the Admin user for one item 
	 * @return item
	 * @throws InventoryItemNotFoundException
	 */
	private InventoryItem getItem(String i) throws InventoryItemNotFoundException {
		if (i.equals("r0")) {
			return contents.get(0);
		} else if (i.equals("r1")) {
			return contents.get(1);
		} else if (i.equals("r2")) {
			return contents.get(2);
		} else if (i.equals("r3")) {
			return contents.get(3);
		} else if (i.equals("r4")) {
			return contents.get(4);
		} else {
			throw new InventoryItemNotFoundException("Item not available in the contents list.");
		}
	}
	/**
	 * Checks to see if the requested item is out of stock
	 * @param itemID
	 */
	public boolean outOfStock(int itemID) {
		if(this.getItem(itemID).getQIS() < 1){
			return true;
		}else{
			return false;
		}
	}
	
	public int getSelectionCost(int selection) {
		return this.getItem(selection).getPrice();
	}
	
	public String getSelection(int selection) {
		return  this.getItemName(selection) ;
	}
	/**
	 * Refill inventory for one item up to its maximum capacity
	 * @param s
	 * @throws FullStockException
	 */
	public void updateInventory(String s) throws FullStockException {
		InventoryItem item = this.getInventoryItem(s);
		for (int i = 0; i < item.getMaxQuantity(); i++) {
			
			if (item.getQIS() < item.getMaxQuantity()) {
				try {
					addToInventory(item.getId(), 1);
				} catch (InvalidQuantityException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
}
