package edu.suny.np.oop.soda;
import edu.suny.np.exceptions.FullStockException;

public class InventoryItem {

	private int ID = 0;
	private static final int MAX_QUANTITY = 3;
	private String name = null;
	private int QIS = 0;
	private final int PRICE = 75;
	
	public InventoryItem(int id, String n, int initialQIS) {
		ID = id;
		name= n;
		QIS = initialQIS;
	}
	
	public void addToInventory(int q) throws FullStockException {
		if(QIS < MAX_QUANTITY){
			QIS++;
		}else{
			throw new FullStockException("Item could not be added. Stock is full.");
		}
		
	}
	
	public void addToInventory() {
	}
	
	public void decrementInventory() {
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
		String output = new String();
		output = "(" + ID + ")" + ": " + name + " - " + QIS;
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
	
	public int getQIS () {
		return QIS;
	}
}
