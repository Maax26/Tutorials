package AOOPChapter1;

/**
 * A class for producing simple greetings.
*/

public class Greeter
{
	private String name;
	
	/**
	 * Constructs a Greeter object that can greet a 
	 * person or entity.
	 * @param aName The name of the person or entity
	 * who should be addressed in the greetings.
	 * */
	public Greeter(String aName)
	{
		name = aName;
	}
	
	/**
	 * Greet with a "Hello" message.
	 * @return A message containing "Hello" and the
	 * name of the greeted person or entity.
	 * */
	public String sayHello()
	{
		return "Hello, " + name + "!";
	}
	
	/**
	 * Greet with a "Good Bye" message.
	 * @return A message containing "Good Bye" and the 
	 * name of the greeted person or entity.
	 * */
	public String sayGoodBye() {
		return "Good Bye, " + name + "!";
	}
}

