package edu.suny.np.soda.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.suny.np.exceptions.InvalidQuantityException;
import edu.suny.np.exceptions.InventoryItemNotFoundException;
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
			inventory.addToInventory(1, 2);
		} catch (InvalidQuantityException e) {
			e.printStackTrace();
		}
		try {
			assertEquals(0, inventory.getInventoryItem("cola").getQIS());
			assertEquals(2, inventory.getInventoryItem("orange").getQIS());
		} catch (InventoryItemNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testAddToInventoryStringInt() {
		inventory.addToInventory("cola", 2);
		try {
			assertEquals(2, inventory.getInventoryItem("cola").getQIS());
		} catch (InventoryItemNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testToString() {
		String output = "(0): cola - 0, (1): orange - 0, (2): sprite - 0, (3): ginger ale - 0";
		assertEquals(output, inventory.toString());
	}

	@Test
	public void testUpdateInventory() {
		
	}
	
	@Test
	public void getInventoryItem() {
		try {
			assertEquals("cola", inventory.getInventoryItem("cola").getName());
		} catch (InventoryItemNotFoundException e) {
			e.printStackTrace();
		}
	}

}
