package Week5Assignments;

public class App {

	public static void main(String[] args) {
		
		Logger logger1 = new AsteriskLogger();
		logger1.log("Live long and prosper");
		
		Logger logger2 = new AsteriskLogger();
		logger2.error("I'm a doctor, not a bartender");
		
		Logger logger3 = new SpacedLogger();
		logger3.log("To boldly go where no man has gone before");
		
		Logger logger4 = new SpacedLogger();
		logger4.error("KHAAAANNNN");
	}
}
