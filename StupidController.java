package stupid.controller;

public class StupidController 
{
	private String myName;
	
	public StupidController() 
	{
		myName = "Braeden";
	}
	
	public void start()
	{
		System.out.println("This program is less stupid");
		System.out.println("My name is " + myName);
	}
}