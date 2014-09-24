package edu.suny.np.oop.soda;

import java.util.HashMap;

import edu.suny.np.exceptions.InvalidCoinException;

public class ChangeMechanism {
	private int cust_q = 0, cust_d = 0 , cust_n = 0;
	private final int MAX_Q = 3;
	private final int MAX_D = 3;
	private final int MAX_N = 3;
	private int amountEntered = 0;
	private int cashBox = 0;
	
	public ChangeMechanism() {
	}
	
	public void resetAmountEntered() {
		amountEntered = 0;
	}
	
	public void init(){
		this.resetAmountEntered();
	}

	public String emptyCashBox() {
		int totalAmount = cashBox;
		cashBox = 0;
		return "Empty cashBox. Total amount: " + totalAmount;
	}
	
	public int getCashbox(){
		return cashBox;
	}
	
	public String toString() {
		String output = "Quarters: " + cust_q + ", Dimes: " + cust_d + ", Nickels: " + cust_n;
		return output;
	}
	
	/**
	 * 
	 * @param c must be 5, 10 or 25
	 * 
	 * Accepts change into the change mechanism. 
	 * @throws InvalidCoinException 
	 */
	public void addChange(int c) throws InvalidCoinException {
		switch (c) {
		case 25:
			amountEntered += 25;
			if( cust_q < MAX_Q){
				cust_q ++;
			}else{
				cashBox += 25;
			}
			break;
		case 10:
			amountEntered += 10;
			if (cust_d < MAX_D) {
				cust_d ++;
			} else {
				cashBox += 10;
			}
			break;
		case 5:
			amountEntered += 5;
			if (cust_n < MAX_N) {
				cust_n ++;
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
	
	private String buildChangeString(int amountReturned) { 
		return Integer.toString(amountReturned);
	}
	
	/**
	 * method called to calculate the  amount of change coming back to the 
	 * machine user. Assumes coins have already been added.
	 * @param cost cost of current selection (Use 0 for lack of inventory)
	 * @return
	 */
	public String getChange(int cost) {
		int amountToReturn = amountEntered - cost;
		int availableChange = this.getAvailableChange();
		if(availableChange < amountToReturn){
			this.resetAmountEntered();
			return Integer.toString(amountToReturn);
		}
		
		HashMap<String, Integer>  coins = new HashMap<String, Integer>();
		coins.put("quarters", 0);
		coins.put("dimes", 0);
		coins.put("nickels", 0);
		
		
		while((cust_q > 0) && (amountToReturn >= 25)){
			amountToReturn -= 25;
			coins.put("quarters", coins.get("quarters") + 1);
			cust_q -= 25;
		}
		while((cust_d > 0) && (amountToReturn >= 10)){
			amountToReturn -= 10;
			coins.put("dimes", coins.get("dimes") + 1);
			cust_q -= 10;
		}
		while((cust_q > 0) && (amountToReturn >= 5)){
			amountToReturn -= 5;
			coins.put("nickles", coins.get("nickles") + 1);
			cust_q -= 5;
		}
		
		int change = coins.get("quarters") * 25 + 
					 coins.get("dimes") * 10 +
					 coins.get("nickles") * 5;
		
		return this.buildChangeString(change);
	}
	
	public int getAvailableChange(){
		return (cust_q * 25 + cust_d * 10 + cust_n * 5);
	}
	
	public int getAmountEntered () {
		return amountEntered;
	}
	
	
	
}
