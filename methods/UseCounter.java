import acm.program.*;

public class UseCounter extends ConsoleProgram {
	public void run() {
		MyCounter count1 = new MyCounter(); //starts at 1
		MyCounter count2 = new MyCounter(1000);
		
		println("Five values for count1:"); //Counts "1 2 3 4 5"
		countFiveTimes(count1);
		
		println("Five values for count2:"); //Counts "1000 1001 1002 1003 1004"
		countFiveTimes(count2);
		
		println("Five more values for count1:"); //Counts "6 7 8 9 10"
		countFiveTimes(count1);
	}
	
	private void countFiveTimes(MyCounter counter) {
		for (int i = 0; i < 5; i++) {
			println(counter.nextValue());
		}
	}
}
