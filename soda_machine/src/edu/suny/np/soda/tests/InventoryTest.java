package edu.suny.np.soda.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.suny.np.exceptions.InvalidQuantityException;
import edu.suny.np.oop.soda.Inventory;

public class InventoryTest {
	
	private Inventory inventory;
	
	 @Before
     public void setUp() {
		 inventory = new Inventory();
     }

	@Test
	public void testAddToInventoryIntInt() {
		try {
			inventory.addToInventory(0, 2);
		} catch (InvalidQuantityException e) {
			e.printStackTrace();
		}
		
	}

	@Test
	public void testAddToInventoryStringInt() {
		try {
			inventory.addToInventory("cola", -1);
		} catch (InvalidQuantityException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testToString() {
		
	}

	@Test
	public void testUpdateInventory() {
		
	}
	
	@Test
	public void getInventoryItem() {
		Inventory inventory = new Inventory();
	}

}
