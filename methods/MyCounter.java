//Used by UseCounter class
public class MyCounter {
	
	public MyCounter(int startValue) {
		counter = startValue;
	}
	
	public MyCounter() {
		counter = 1;
	}
	
	public int nextValue() {
		int temp = counter;	
		counter++;
		
		//First time you can nextValue(), it returns your starting value.
		//But next time you call it, it shows the incremented value from last time.
		//That's why we need temp. If we just returned counter, it would start with 2 instead of 1.
		return temp;				
	}
	
	//counter is an INSTANCE variable which is REMEMBERED by MyCounter objects each time nextValue() is called.
	//temp is a local variable that is FORGOTTEN right after nextValue().
	//Each instance variable is different for each instance for MyCounter.
	private int counter;
	
/*	If you use "static," counter now becomes a CLASS variable. Now all instances of MyCounter 
 *  refer to the SAME value of counter! This becomes the one and only version of counter for
 *  all MyCounter objects. Thus when it is called by 2 different MyCounter instances, the next
 *  instance remembers what the previous instance's value of counter was and adds to it!
 * 
 *  private static int counter;
 */
}
