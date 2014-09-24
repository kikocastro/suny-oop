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
		assertEquals(0, inventory.getInventoryItem("cola").getQIS());
		assertEquals(2, inventory.getInventoryItem("orange").getQIS());
	}

	@Test
	public void testAddToInventoryStringInt() {
		inventory.addToInventory("r0", 2);
		assertEquals(2, inventory.getInventoryItem("cola").getQIS());
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
		assertEquals("cola", inventory.getInventoryItem("cola").getName());
	}
	
	@Test
	public void testInsufficientFunds() {
		assertFalse(inventory.insufficientFunds("cola", 75));
		assertTrue(inventory.insufficientFunds("cola", 74));
	}
	
	@Test
	public void testGetItemName(){
		assertEquals("cola", inventory.getItemName(0));
		assertNotEquals("cola", inventory.getItemName(1));
	}

	@Test
	public void testOutOfStock(){
		try {
			inventory.addToInventory(2, 1);
		} catch (InvalidQuantityException e) {
			e.printStackTrace();
		}
		assertTrue(inventory.outOfStock(0));
		assertFalse(inventory.outOfStock(2));
	}

}
