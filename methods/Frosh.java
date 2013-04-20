
public class Frosh extends Student {
	public Frosh(String name, int id) {
		super(name, id);
		setUnits(0);
	}
	
	public String toString() {
		//studentName and studentID are private in Student. Even though Frosh is
		//subclass of Student, it may NOT access private instance variables!
		return "Frosh: " + getName() + " (#" + getID() + ")";
	}
}
