/**
 * The Rational class is used to represent rational numbers, which
 * are defined to be the quotient of two integers. It lets you create 
 * a rational number x / y, which it reduces to the simplest fraction.
 * Then it lets you add, subtract, multiply, and divide rational numbers.
 * Chp. 6, p. 153, "The Art and Science of Java," Eric Roberts
 */

import acm.util.*;
import acm.program.*;

public class Rational extends ConsoleProgram {
	
	public Rational() {  //Constructor. If you just say "new Rational()", it returns 0
		this(0);
	}
	
	public Rational(int n) { //if you call it with "new Rational(n)", it just returns n/1 = n
		this(n, 1);
	}
	
	// Creates new Rational x / y, which is reduced to the simplest value
	public Rational(int x, int y) {
		if (y == 0) throw new ErrorException("Cannot divide by 0!");
		int g = gcd(Math.abs(x), Math.abs(y)); // find greatest common divisor of x, y
		num = x / g;	// new numerator, after reducing fraction
		den = Math.abs(y) / g; // keep denominator positive. New denominator, after reducing fraction
		if (y < 0) num = - num; // if y < 0, change sign of numerator
	}
	
	/**
	 * Adds the rational number r to this one and returns the sum.
	 * @param r The rational number to be added
	 * @return The sum of the current number and r
	 * 
	 * a/b + c/d = (ad + bc)/bd
	 */
	public Rational plus(Rational r) {
		return new Rational(this.num * r.den + this.den * r.num,	//"this" is optional. 
							this.den * r.den);	//"this" means num or den of current fraction (before "plus")
	}
	
	/**
	 * Subtracts the rational number r from this one.
	 * @param r The rational number to be subtracted
	 * @return The result of subtracting r from the current number
	 * 
	 * a/b - c/d = (ad - bc)/bd
	 */
	public Rational minus(Rational r) {
		return new Rational(this.num * r.den - this.den * r.num,
							this.den * r.den);
	}
	
	/**
	 * Multiplies this number by the rational number r.
	 * @param r The rational number used as a multiplier
	 * @return The result of multiplying the current number by r
	 * 
	 * a/b * c/d = ac/bd
	 */
	public Rational times(Rational r) {
		return new Rational(this.num * r.num, this.den * r.den);
	}
	
	/**
	 * Divides this number by the rational number r.
	 * @param r The rational number used as a divisor
	 * @return The result of dividing the current number by r
	 * 
	 * a/b divide by c/d = ad/bc
	 */
	public Rational divide(Rational r) {
		return new Rational(this.num * r.den, this.den * r.num);
	}
	
	// overrides default toString() method to make our own string output of this rational number
	public String toString() {
		if (den == 1) {
			return "" + num;	//we add "" + num to force it to change an int type to a String
		} else {
			return num + "/" + den;
		}
	}
	
	/**
	 * Calculates the greatest common divisor using Euclid's algorithm.
	 * @param x First integer
	 * @param y Second integer
	 * @return The greatest common divisor of x and y
	 */
	private int gcd(int x, int y) {  
		int r = x % y;
		while (r != 0) {
			x = y;
			y = r;
			r = x % y;
		}
		return y;
	}
	
	public void run(){
//		Rational ans = new Rational();	// Must initialize ans here
//		String op;	// +, -, *, or /
		println("Enter 2 fractions, . This program lets you add, subtract, multiply, or divide them.");
		while(true) {
			int n1 = 0, n2 = 0;
			int d1 = 0, d2 = 0;
			while (d1 == 0) {
				n1 = readInt("Numerator of fraction 1: ");
				d1 = readInt("Denominator of fraction 1: ");
			}
			Rational f1 = new Rational (n1, d1);
			
			while (d2 == 0) {
				n2 = readInt("Numerator of fraction 2: ");
				d2 = readInt("Denominator of fraction 2: ");
			}
			Rational f2 = new Rational (n2, d2);

/* If you want option to pick which of 4 operations you use:			
			op = readLine("Add, subtract, multiply, or divide? Enter +, -, *, /: ");
			
			if (op.equals("+")) {ans = f1.plus(f2);}
			if (op.equals("-")) {ans = f1.minus(f2);}
			if (op.equals("*")) {ans = f1.times(f2);}
			if (op.equals("/")) {ans = f1.divide(f2);}
*/
		
			println(f1 + " " + "+" + " " + f2 + " = " + f1.plus(f2));
			println(f1 + " " + "-" + " " + f2 + " = " + f1.minus(f2));
			println(f1 + " " + "*" + " " + f2 + " = " + f1.times(f2));
			println(f1 + " " + "/" + " " + f2 + " = " + f1.divide(f2));
		}
	}
	
	/* Private instance variables */
	private int num;   /* The numerator of this Rational   */
	private int den;   /* The denominator of this Rational */
}