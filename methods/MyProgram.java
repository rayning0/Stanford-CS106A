import acm.program.*;

public class MyProgram extends ConsoleProgram {

	public void run() {
		balance = 0;
		for(int i = 0; i < 5; i++) {
		   int value = readInt("Value? ");
		   addToBalance(value);
		}
		println(balance);
	}
	
	/*
	 * A method that adds to an instance variable, balance.
	 * Precondition: The value of the input parameter plus the
	 *    balance should not exceed the maximum possible int value.
	 * Postcondition: The balance is updated by the amount of the
	 *    parameter that is passed in.
	 */
	private void addToBalance(int val) {
		balance += val;
	}
		
	/* Private instance variables */
	private int balance;
}
