package edu.suny.np.soda.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.suny.np.exceptions.EmptyStockException;
import edu.suny.np.exceptions.FullStockException;
import edu.suny.np.exceptions.InvalidQuantityException;
import edu.suny.np.oop.soda.InventoryItem;

public class InventoryItemTest {

	@Test
	public void testAddToInventoryInt() throws InvalidQuantityException {
		InventoryItem item1 = new InventoryItem(1, "orange", 0);
		assertEquals(0, item1.getQIS());
		try {
			item1.addToInventory(2);
		} catch (FullStockException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(2, item1.getQIS());
		
	}

	@Test
	public void testAddToInventory() {
		InventoryItem item1 = new InventoryItem(1, "orange", 0);
		assertEquals(0, item1.getQIS());
		try {
			item1.addToInventory();
		} catch (FullStockException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(1, item1.getQIS());
	}

	@Test
	public void testDecrementInventory() {
		InventoryItem item1 = new InventoryItem(1, "orange", 1);
		assertEquals(1, item1.getQIS());
		try {
			item1.decrementInventory();
		} catch (EmptyStockException e) {
			e.printStackTrace();
		}
		assertEquals(0, item1.getQIS());
	}

	@Test
	public void testToString() {
		InventoryItem item1 = new InventoryItem(1, "orange", 3);
		assertEquals("(1): orange - 3", item1.toString());
	}

	@Test
	public void testEqualsInventoryItem() {
		InventoryItem item1 = new InventoryItem(1, "orange", 3);
		InventoryItem item2 = new InventoryItem(1, "orange", 3);
		InventoryItem item3 = new InventoryItem(2, "sprite", 3);
		InventoryItem nullItem = null;
		String equalsMethodTest = new String();
		
		assertTrue(item1.equals(item2));
		assertFalse(item1.equals(item3));
		assertFalse(item1.equals(nullItem));
		assertFalse(item1.equals(equalsMethodTest));
	}

}
