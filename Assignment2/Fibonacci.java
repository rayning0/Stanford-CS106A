//Section 2. Problem 1.

import acm.program.*;

public class Fibonacci extends ConsoleProgram {
	public void run() {
		int i = 0;
		println("This program lists the Fibonacci sequence (for #'s < 10000):");
		while (fib(i) < MAX) {
			println("i = " + i + ", f(i) = " + fib(i));
			i++;
		}
	}
	
	private int fib(int n) {
		int i, f0 = 0, f1 = 1, f = 0;
		if (n == 0) return 0;
		if (n == 1) return 1;
		for (i = 0; i < n-1; i++) {
			f = f0 + f1;
			f0 = f1;
			f1 = f;
		}
		return f;
	}
/*	
	private int fib(int n) {
		if (n == 0) return 0; //base case
		if (n == 1) return 1; //base case
		return (fib (n - 1) + fib(n - 2)); //recursive solution
	}
*/	
	private static final int MAX = 10000;
}
/* Class solution: better than mine

import acm.program.*;
public class Fibonacci extends ConsoleProgram {
	public void run() {
		println("This program lists the Fibonacci sequence.");
		int t1 = 0;
		int t2 = 1;
		while (t1 <= MAX_TERM_VALUE) {
			println(t1);
			int t3 = t1 + t2;
			t1 = t2;
			t2 = t3;
		}
	}

private static final int MAX_TERM_VALUE = 10000;
}

*/
