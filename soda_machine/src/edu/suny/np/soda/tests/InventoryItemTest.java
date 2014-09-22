package edu.suny.np.soda.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.suny.np.oop.soda.InventoryItem;

public class InventoryItemTest {
	
	InventoryItem item1 = new InventoryItem(1, "orange", 3);
	InventoryItem item2 = new InventoryItem(1, "orange", 3);
	InventoryItem item3 = new InventoryItem(2, "sprite", 3);
	InventoryItem nullItem = null;
	String equalsMethodTest = new String();

	@Test
	public void testAddToInventoryInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddToInventory() {
		fail("Not yet implemented");
	}

	@Test
	public void testDecrementInventory() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		assertEquals("(1): orange - 3", item1.toString());
	}

	@Test
	public void testEqualsInventoryItem() {
		assertTrue(item1.equals(item2));
		assertFalse(item1.equals(item3));
		assertFalse(item1.equals(nullItem));
		assertFalse(item1.equals(equalsMethodTest));
	}

}
