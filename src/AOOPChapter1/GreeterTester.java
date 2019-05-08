package AOOPChapter1;


public class GreeterTester {
	/**
	 * Creates a Greeter and prints out a "Hello" 
	 * and "Good Bye" greeting to an object or entity.
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Greeter worldGreeter = new Greeter("World");
		System.out.println(worldGreeter.sayHello());
		System.out.println(worldGreeter.sayGoodBye());
	}
}
