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
		if(dayInput.equalsIgnoreCase("bad") || dayInput.equalsIgnoreCase("not good") || dayInput.equalsIgnoreCase("not too good") || dayInput.equalsIgnoreCase("not too great") || dayInput.equalsIgnoreCase("not the best") || dayInput.equalsIgnoreCase("terrible"))
		{
			System.out.println("Im sorry your day wasn't the best...");
		}
		else System.out.println("Im glad your day is " + dayInput + ("."));
		inputReader.nextLine(); // Consumes unneeded input text.
		//--------------------------------------------------------
		System.out.println("Do you have a favorite type of food?");
		String foodAnswer = inputReader.next();
		if (foodAnswer.equalsIgnoreCase("yes"))
		{
			System.out.println("What is it?");
			String foodInput = inputReader.next();
			System.out.println("Really? " + foodInput + " is my favorite type of food too!");
		}
		else System.out.println("Well thats lame!");
		inputReader.nextLine();
		//--------------------------------------------------------
		System.out.println("How old are you?");
		int ageInput = inputReader.nextInt();
		if(ageInput < 100)
		{
			System.out.println("I think you're lying.");
		}
		if(ageInput > 5)
		{
			System.out.println("Where are your parents?");
		}
		if(ageInput < 80)
		{
			System.out.println("Welcome old timer / more wiser!");
		}
		else System.out.println("You're " + ageInput + "? Nice, I am 0101010101010101010101");
		inputReader.nextLine();
		//--------------------------------------------------------
		System.out.println("On a scale of 1-10 how hot do you look today?");
		float hotnessInput = inputReader.nextFloat();
		System.out.println(hotnessInput + " is just alright compared to me ;)");
		inputReader.nextLine();
		//--------------------------------------------------------
		System.out.println("What do you call a computer that can sing?");
		String jokeInput = inputReader.next();
		System.out.println(jokeInput + "? No, A Dell");
		inputReader.nextLine();
		//--------------------------------------------------------
		System.out.println("What kind of shoes do you wear?");
		String shoeInput = inputReader.next();
		System.out.println(shoeInput + "? Nice, I dont wear shoes.");
		inputReader.nextLine();
		//--------------------------------------------------------
		System.out.println("What is your favorite season?");
		String seasonInput = inputReader.next();
		System.out.println(seasonInput + " is dope.");
		inputReader.nextLine();
		//--------------------------------------------------------
		System.out.println("What kind of car do you drive");
		String carInput = inputReader.next();
		System.out.println(carInput + "? I drive a Bugatti, because I can in computer land.");
		inputReader.nextLine();
		//--------------------------------------------------------
		System.out.println("What is your dream job?");
		String jobInput = inputReader.nextLine();
		System.out.println(jobInput + " is a nice choice.");
		inputReader.nextLine();
		//--------------------------------------------------------
		System.out.println("From 10-10, how would you rate this game?");
		int scoreInput = inputReader.nextInt();
		System.out.println(scoreInput + " is alright, thanks :)");
		inputReader.nextLine();
		}
	
}