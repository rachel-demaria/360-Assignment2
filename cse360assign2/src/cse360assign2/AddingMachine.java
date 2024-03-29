package cse360assign2;

/**
 * Performs basic arithmetic on an integer: Total
 * 
 * @author Rachel DeMaria
 * @param value input integer that is to be manipulated mathematically 
 * @return Total: (Integer) returns the Total integer 
 * */

public class AddingMachine {
	
	private int total;
	private String string = "0";
	
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		}
	
	public int getTotal () {
		return total;
		}
	
	public void add (int value) {
		total = total + value;
		string = string + " + " + value;
	}
	
	public void subtract (int value) {
		total = total - value;
		string = string + " - " + value;
	}
	
	public String toString () {
		return string;
		}
	
	public void clear() {
		total = 0;
	}
}


