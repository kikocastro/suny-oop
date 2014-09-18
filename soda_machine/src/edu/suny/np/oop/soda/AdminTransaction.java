package edu.suny.np.oop.soda;

import java.util.StringTokenizer;


public class AdminTransaction extends Transaction {
	
	public AdminTransaction(SodaMachine sm) {
		super(sm);
		this.name = "Admin Transaction";
		
		legalInputs.add("q");
		legalInputs.add("R");
		legalInputs.add("r0");
		legalInputs.add("r1");
		legalInputs.add("r2");
		legalInputs.add("r3");
		legalInputs.add("r4");
	}
	
	public void entry() {
	}
	public void run() {

	}
}
