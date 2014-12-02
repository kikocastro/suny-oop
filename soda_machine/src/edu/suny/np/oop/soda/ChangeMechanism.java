package edu.suny.np.oop.soda;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Observable;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import edu.suny.np.exceptions.InvalidCoinException;

public class ChangeMechanism extends Observable {
	private int cust_q = 0, cust_d = 0, cust_n = 0;
	private final int MAX_Q = 3;
	private final int MAX_D = 3;
	private final int MAX_N = 3;
	private int amountEntered = 0;
	private int[] tempCoinsEntered = { 0, 0, 0 };
	private int cashBox = 0;
	private String change = "";
	private ArrayList<ChangeListener> listeners;

	public ChangeMechanism() {
		listeners = new ArrayList<ChangeListener>();
	}

	public void addChangeListener(ChangeListener listener) {
		listeners.add(listener);
	}

	public String getChange() {
		return change;
	}
	
	public void addToCashBox(int coin){
		cashBox += coin;
		// Notify all observers
				ChangeEvent event = new ChangeEvent(this);
				for (ChangeListener listener : listeners)
					listener.stateChanged(event);
	}
	
	private void setChange(String newChange){
		change = newChange;
		// Notify all observers
				ChangeEvent event = new ChangeEvent(this);
				for (ChangeListener listener : listeners)
					listener.stateChanged(event);
	}

	/**
	 * Resets the amount of money entered
	 */

	public void resetAmountEntered() {
		amountEntered = 0;
	}

	private void resetTempCoins() {
		for (int i = 0; i < tempCoinsEntered.length; i++) {
			tempCoinsEntered[i] = 0;	
		}
	}

	public void remax() {
		cust_q = MAX_Q;
		cust_d = MAX_D;
		cust_n = MAX_N;
		// Notify all observers
				ChangeEvent event = new ChangeEvent(this);
				for (ChangeListener listener : listeners)
					listener.stateChanged(event);
	}

	/**
	 * Empties cashBox
	 * 
	 * @return totalAmount
	 */
	public String emptyCashBox() {
		int totalAmount = cashBox;
		cashBox = 0;
		return "Empty cashBox. Total amount: " + totalAmount;
	}

	public int getCashbox() {
		return cashBox;
	}

	/**
	 * @return Amount of each coin type (quarters, dimes and nickels)
	 */
	public String toString() {
		String output = "Quarters: " + cust_q + ", Dimes: " + cust_d
				+ ", Nickels: " + cust_n;
		return output;
	}

	// * if not canceled or timeout, process tempchange
	private void processEnteredCoins() {
		for (int i = 0; i < tempCoinsEntered[2]; i++) {
			if (cust_q < MAX_Q) {
				cust_q++;
			} else {
				addToCashBox(25);
			}
		} 
		for (int i = 0; i < tempCoinsEntered[1]; i++) {
			if (cust_d < MAX_D) {
				cust_d++;
			} else {
				addToCashBox(10);
			}
		}
		for (int i = 0; i < tempCoinsEntered[0]; i++) {
			if (cust_n < MAX_N) {
				cust_n++;
			} else {
				addToCashBox(5);
			}
		}
		resetTempCoins();
	}

	/**
	 * Cancels the purchase by returning all the money inserted and reseting the
	 * amount entered value to 0
	 */

	public void cancelPurchase() {
		setChange(Integer.toString(amountEntered));
		resetTempCoins();
		resetAmountEntered();
	}

	/**
	 * 
	 * @param c
	 *            must be 5, 10 or 25
	 * 
	 *            Accepts change into the change mechanism.
	 * @throws InvalidCoinException
	 */
	public void addChange(int c) {
		switch (c) {
		case 25:
			amountEntered += 25;
			tempCoinsEntered[2] += 1;
			break;
		case 10:
			amountEntered += 10;
			tempCoinsEntered[1] += 1;
			break;
		case 5:
			amountEntered += 5;
			tempCoinsEntered[0] += 1;
			break;

		default:
		}

		// Notify all observers
		ChangeEvent event = new ChangeEvent(this);
		for (ChangeListener listener : listeners)
			listener.stateChanged(event);
	}

	/**
	 * @param String
	 *            with the name of the coin to be inserted (quarters, dimes and
	 *            nickels)
	 * @throws InvalidCoinException
	 */
	public void addChange(String s) throws InvalidCoinException {
		String coin = s.toLowerCase();

		if (coin == "quarter") {
			this.addChange(25);
		} else if (coin == "dime") {
			this.addChange(10);
		} else if (coin == "nickel") {
			this.addChange(5);
		} else {
			throw new InvalidCoinException("Invalid coin inserted");
		}
	}

	/**
	 * 
	 * @param amountReturned
	 * @return String with the value to be returned
	 */
	private String buildChangeString(int amountReturned) {
		return "Change: " + Integer.toString(amountReturned) + " cents.";
	}

	/**
	 * method called to calculate the amount of change coming back to the
	 * machine user. Assumes coins have already been added.
	 * 
	 * @param cost
	 *            cost of current selection (Use 0 for lack of inventory)
	 * @return String with change
	 */
	public void processChange(int cost) {
		processEnteredCoins();
		int amountToReturn = amountEntered - cost;

		int[] coins = { 0, 0, 0 };

		while ((cust_q > 0) && (amountToReturn >= 25)) {
			amountToReturn -= 25;
			coins[2]++;
			cust_q--;
		}
		while ((cust_d > 0) && (amountToReturn >= 10)) {
			amountToReturn -= 10;
			coins[1]++;
			cust_d--;
		}
		while ((cust_n > 0) && (amountToReturn >= 5)) {
			amountToReturn -= 5;
			coins[0]++;
			cust_n--;
		}

		int newChange = coins[2] * 25 + coins[1] * 10 + coins[0] * 5;
		if (newChange == (amountEntered - cost)) {
			setChange(Integer.toString(newChange));
		} else {
			setChange("invalid change");
		}
		resetAmountEntered();
	}

	/**
	 * 
	 * @return Sum of available coins in the coin stack
	 */
	public int getAvailableChange() {
		return (cust_q * 25 + cust_d * 10 + cust_n * 5);
	}

	public int getAmountEntered() {
		return amountEntered;
	}

	public int[] getCoinReturn() {
		int[] coins = new int[3];
		coins[0] = cust_n;
		coins[1] = cust_d;
		coins[2] = cust_q;
		return coins;
	}

}
