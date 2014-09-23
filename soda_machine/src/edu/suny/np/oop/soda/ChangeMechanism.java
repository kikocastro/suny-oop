package edu.suny.np.oop.soda;

import edu.suny.np.exceptions.InvalidCoinException;

public class ChangeMechanism {
	private int cust_q = 0, cust_d = 0 , cust_n = 0;
	private final int MAX_Q = 3;
	private final int MAX_D = 3;
	private final int MAX_N = 3;
	private int changeBox = 0;
	private int amountEntered = 0;
	private int cashBox = 0;
	
	public ChangeMechanism() {
	}
	
	public void resetAmountEntered() {
		amountEntered = 0;
	}
	
	public void init(){
		
	}
	
//	public String emptyCashBox() {
//		return "";
//	}
	
	public String toString() {
		String output = "Quarters: " + cust_q + ", Dimes: " + cust_d + ", Nickels: " + cust_n;
		return output;
	}
	/**
	 * 
	 * @param c must be 5, 10 or 25
	 * 
	 * Accepts change into the change mechanism. If 
	 * @throws InvalidCoinException 
	 */
	public void addChange(int c) throws InvalidCoinException {
		switch (c) {
		case 25:
			if( c <= MAX_Q){
				cust_q += 25;
			}else{
				cashBox += 25;
			}
			break;
		case 10:
			if (c <= MAX_D) {
				cust_d += 10;
			} else {
				cashBox += 10;
			}
			break;
		case 5:
			if (c <= MAX_N) {
				cust_n += 5;
			} else {
				cashBox += 5;
			}
			break;

		default:
			throw new InvalidCoinException("Invalid coin inserted");
		}
		
		
	}
	
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
//	
//	private String buildChangeString(int amountReturned) { 
//	}
	
	/**
	 * method called to calculate the  amount of change coming back to the 
	 * machine user. Assumes coins have already been added.
	 * @param cost cost of current selection (Use 0 for lack of inventory)
	 * @return
	 */
	public String getChange(int cost) {
		String change = Integer.toString(amountEntered - cost);
		return change;
	}
	
	public int getAmountEntered () {
		return amountEntered;
	}
	
	
	
}
