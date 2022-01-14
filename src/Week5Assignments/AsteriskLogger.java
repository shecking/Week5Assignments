package Week5Assignments;

public class AsteriskLogger implements Logger {
	
	public void log(String logStr) {
		System.out.println("***" + logStr + "***");
	}
	
	public void error(String errorStr) {
		String onlyAsterisks = "";
		int lineLength = errorStr.length() + 13;
		// 13 = (length of "Error: ") + (length of beginning and ending "***")
		// flat amount of extra characters, this will never need to change
		for (int i = 0; i < lineLength; i ++) {
			onlyAsterisks = onlyAsterisks + "*";
		}
		// looping to determine appropriate # of "*" characters for top and bottom
		System.out.println(onlyAsterisks);
		System.out.println("***" + "Error: " + errorStr + "***");
		System.out.println(onlyAsterisks);
		// printing error message in box of * characters
	}
}
