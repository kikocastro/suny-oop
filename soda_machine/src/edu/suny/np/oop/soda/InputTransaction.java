package edu.suny.np.oop.soda;


public class InputTransaction extends Transaction {
	
	public InputTransaction(SodaMachine sm) {
		name = "Input Transaction";
		
		legalInputs.add("a");
		legalInputs.add("5");
		legalInputs.add("10");
		legalInputs.add("25");
		legalInputs.add("s1");
		legalInputs.add("s2");
		legalInputs.add("s3");
		legalInputs.add("s4");
		legalInputs.add("s5");
	}
	

	public void entry() {
	}
	public void run() {

	}
}
