package edu.suny.np.oop.soda;

import java.util.StringTokenizer;


public class AdminTransaction extends Transaction {
	
	public AdminTransaction(SodaMachine sm) {
		super(sm);
		this.name = "Admin Transaction";
	}
	
	public void entry() {
	}
	public void run() {

	}
}
