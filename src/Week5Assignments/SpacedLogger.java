package Week5Assignments;

public class SpacedLogger implements Logger {

	public void log(String logStr) {
		String logStrSpaced = logStr.replace("", " ").trim();
		System.out.println(logStrSpaced);
	}
	
	public void error(String errorStr) {
		String errorStrSpaced = "ERROR: " + errorStr.replace("", " ").trim();
		System.out.println(errorStrSpaced);
	}
	
}
