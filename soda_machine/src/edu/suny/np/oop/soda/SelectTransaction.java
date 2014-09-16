package edu.suny.np.oop.soda;


public class SelectTransaction extends Transaction {

	public SelectTransaction(SodaMachine sm ) {
		name = "Select Transaction";

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
