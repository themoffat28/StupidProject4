package stupid.controller;

import java.util.Scanner; //Telling program to grab instructions of scanners from util folder. 

public class StupidController
{
	private String myName;
	private Scanner inputReader; // Data members

	public StupidController() //Initalizes a data member (strings)
	{
		myName = "Braeden";
		inputReader = new Scanner(System.in); 
	}

	public void start() //Method section
	{
		System.out.println("My name is " + myName);
		System.out.println("This program talks back");
		askQuestions();
	}

	private void askQuestions()
	{
		System.out.println("How was your day?");
		String input = inputReader.nextLine(); 
		System.out.println("Oh, you had a " + input + " day?");
	}
	
}