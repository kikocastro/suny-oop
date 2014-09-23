package edu.suny.np.oop.soda;
import java.util.*;


public class Transaction {

	protected int ID;
	protected String name = null;
	static public final int INIT_TID = 0;
	static public final int ADMIN_TID = 1;
	static public final int SELECT_TID = 2;
	static public final int INPUT_TID = 3;

	
	protected ArrayList<String> legalInputs = new ArrayList<String>();
	
	protected SodaMachine mSodaMachine;
	
	public Transaction(SodaMachine sm) {
		mSodaMachine = sm;
	}
	
	/**
	 * dummy constructor for searching transaction list
	 * @param tid legal transaction identifier
	 */
	public Transaction(int tid) {
		
	}
	
	public boolean isLegalInput(String s) {
		if (legalInputs.contains(s)) {
			return true;
		}else {
			return false;
		}
	}
	
	public Boolean equals(Transaction t){
		if (this == t) {
			return true;
		} else {
			return false;
		}
	}
	
	public void displayLegalInputs() {
		System.out.println("Legal Inputs:");
		if(legalInputs.isEmpty()){
			System.out.println("none");
		}else{
			System.out.println(legalInputs);
		}
	}
	
	public void entry() {
		System.out.println("Entering "+ name);
		displayLegalInputs();
	}
	
	public void run() {}
		
}
