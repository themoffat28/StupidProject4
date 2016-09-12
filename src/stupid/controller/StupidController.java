package stupid.controller;

import java.util.Scanner; //Telling program to grab instructions of scanners from util folder. 

public class StupidController
{
	private String myName;
	private Scanner inputReader; // Data members

	public StupidController() // Constructor (Initalizes a data member (strings)
	{
		myName = "Braeden";
		inputReader = new Scanner(System.in); 
	}

	public void start() // Method section
	{
		System.out.println("My name is " + myName);
		System.out.println("This program talks back");
		askQuestions();
	}

	private void askQuestions() 
	{
		System.out.println("How is your day?");
		String dayInput = inputReader.next(); 
		if(dayInput.equals("bad"))
		{
			System.out.println("Im sorry your day wasn't the best...");
		}
		else System.out.println("Oh, you're having a " + dayInput + " day?");
		inputReader.nextLine(); // Consumes unneeded input text.
		
		System.out.println("My next question is: What do you think is the best type of food?");
		String foodInput = inputReader.next();
		System.out.println("Really? " + foodInput + " is my favorite type of food too!");
		inputReader.nextLine();
		
		System.out.println("How old are you?");
		int ageInput = inputReader.nextInt();
		System.out.println("You're " + ageInput + "? Nice, I am 0101010101010101010101");
		inputReader.nextLine();
		
		System.out.println("On a scale of 1-10 how hot do you look today?");
		float hotnessInput = inputReader.nextFloat();
		System.out.println(hotnessInput + " is just alright compared to me ;)");
		inputReader.nextLine();
		
		System.out.println("What do you call a computer that can sing?");
		String jokeInput = inputReader.next();
		System.out.println(jokeInput + "? No, A Dell");
		inputReader.nextLine();
		
		System.out.println("What kind of shoes do you wear?");
		String shoeInput = inputReader.next();
		System.out.println(shoeInput + "? Nice, I dont wear shoes.");
		inputReader.nextLine();
		
		System.out.println("What is your favorite season?");
		String seasonInput = inputReader.next();
		System.out.println(seasonInput + " is dope.");
		inputReader.nextLine();
		
		System.out.println("What kind of car do you drive");
		String carInput = inputReader.next();
		System.out.println(carInput + "? I drive a Bugatti, because I can in computer land.");
		inputReader.nextLine();
		
		System.out.println("What is your dream job?");
		String jobInput = inputReader.nextLine();
		System.out.println(jobInput + " is a nice choice.");
		inputReader.nextLine();
		
		System.out.println("From 10-10, how would you rate this game?");
		int scoreInput = inputReader.nextInt();
		System.out.println(scoreInput + " is alright, thanks :)");
		inputReader.nextLine();
		}
	
}