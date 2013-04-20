/** 
 * 
 * Lets you create new students, add units, check if student has enough units to graduate
 *
 */

public class Student {
	public Student(String name, int id) {
		studentName = name;
		studentID = id;
	}
	
	// getters
	public String getName() {
		return studentName;
	}
	public int getID() {
		return studentID;
	}
	public double getUnits() {
		return unitsEarned;
	}
	
	// setter
	public void setUnits(double units) {
		unitsEarned = units;
	}
	
	public void incrementUnits(double units) {
		unitsEarned += units;
	}
	
	public boolean enoughUnits() {
		return unitsEarned >= UNITS_TO_GRADUATE;
	}
	
	//show nicely formatted text output when I print instance of this class
	public String toString() {
		return studentName + " #(" + studentID + ")";
	}
	
	//class variable. Constant for all instances of this class.
	public static final double UNITS_TO_GRADUATE = 180;
	
	//instance variables. New for each new student instance created.
	private String studentName;
	private int studentID;
	private double unitsEarned; /* number of units earned */
}
