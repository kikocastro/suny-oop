package edu.suny.np.oop.soda;
import edu.suny.np.exceptions.*;

public class InventoryItem {

	private int ID = 0;
	private static final int MAX_QUANTITY = 3;
	private String name = null;
	private int QIS = 0;
	private final int PRICE = 75;
	/**
	 * 
	 * @param id of item
	 * @param n name
	 * @param initialQIS quantity in stock
	 */
	public InventoryItem(int id, String n, int initialQIS) {
		ID = id;
		name= n;
		QIS = initialQIS;
	}
	/**
	 * Adds to inventory until it reaches its maximum capacity
	 * @param q quantity
	 * @throws FullStockException
	 * @throws InvalidQuantityException
	 */
	public void addToInventory(int q) throws FullStockException, InvalidQuantityException {
		if (q < 1) {
			throw new InvalidQuantityException("Please insert an integer value greater than 0");
		}
		if(QIS < MAX_QUANTITY){
			QIS += q;
		}else{
			throw new FullStockException("Item could not be added. Stock is full.");
		}
	}
	/**
	 * Increments one item to the inventory
	 * @throws FullStockException
	 */
	public void addToInventory() throws FullStockException {
		if(QIS < MAX_QUANTITY){
			QIS ++;
		}else{
			throw new FullStockException("Item could not be added. Stock is full.");
		}
	}
	/**
	 * Decrements one item from inventory
	 * @throws EmptyStockException
	 */
	public void decrementInventory() throws EmptyStockException {
		if(QIS > 0){
			QIS --;
		}else{
			throw new EmptyStockException("Item could not be decremented. Stock is already empty.");
		}
	}
	
	public int getPrice() {
		return PRICE;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		// sample output:
		//         (1): orange - 3
		String output = "(" + ID + ")" + ": " + name + " - " + QIS;
		return output;
	}
	
	public boolean equals(InventoryItem io) {
		if(this == io){
			return true;
		}
		
		if (io == null) {
			return false;
		}
		
		if (this.getClass() != io.getClass()) {
			return false;
		}
		
		InventoryItem otherInventory = (InventoryItem) io;
		
		if (this.name != otherInventory.name) {
			return false;
		}
		
		if (this.name == null) {
			if(otherInventory.name != null){
				return false;
			}else{
				if (!this.name.equals(otherInventory.name)) {
					return false;
				}
			}
		}
		return true;
	}
	
	public int getMaxQuantity(){
		return MAX_QUANTITY;
	}
	
	public int getId(){
		return ID;
	}
	
	public int getQIS () {
		return QIS;
	}
}
