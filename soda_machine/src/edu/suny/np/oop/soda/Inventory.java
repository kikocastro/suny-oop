package edu.suny.np.oop.soda;

import java.util.*;

import edu.suny.np.exceptions.FullStockException;
import edu.suny.np.exceptions.InvalidQuantityException;

public class Inventory {

	public static String COLA= "cola";
	public static String ORANGE= "orange";
	public static String SPRITE= "sprite";
	public static String GINGER_ALE= "ginger ale";
	public static String DIET_COLA= "cola";
	private int selection = 0;
	
	
	private ArrayList<InventoryItem> contents = null;
	
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
			System.out.println("Add to inventory error.");
		}
	}
	
	public void addToInventory(String  n, int q ) {
		try {
			int index = contents.indexOf(n);
			contents.get(index).addToInventory(q);
		} catch (FullStockException e) {
			e.printStackTrace();
		} catch (Exception e){
			System.out.println("Add to inventory error.");
		}
	}
	
	public String toString() {
		
		return "";
	}
	
//	public InventoryItem getInventoryItem(String s) {
//		
//	}
//	
//	public boolean insufficientFunds(int item, int amountEntered) {
//		
//	}
	
//	public String getItemName(int i) {
//	}
//	
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
	
}
