import acm.program.*;

public class Stanford extends ConsoleProgram {
	public void run() {
		Student stud = new Student("Raymond Gan", 1011);
		stud.setUnits(175.0);
		
		println(stud + " has " + stud.getUnits() + " units");
		println("His ID number is " + stud.getID());
		println("Can he graduate yet? " + stud.enoughUnits());
		println();
		println("After taking CS 106A,");
		stud.incrementUnits(5);
		println("Can he graduate yet? " + stud.enoughUnits());
		println("Rock on, " + stud + "!");
	}
}
