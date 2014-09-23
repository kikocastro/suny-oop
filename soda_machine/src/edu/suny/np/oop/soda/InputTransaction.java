package edu.suny.np.oop.soda;


public class InputTransaction extends Transaction {
	
	public InputTransaction(SodaMachine sm) {
		super(sm);
		this.name = "Input Transaction";
		
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
	
// must display basic menu
	// with line with values inserted after entry
	// last thing assign new value to soda mach transaction
	public void entry() {
	}
	public void run() {
		entry();
		
	}
}
