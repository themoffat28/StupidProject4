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
		playWithStrings();
		//System.out.println("My name is " + myName);
		//System.out.println("This program talks back");
		//askQuestions();
	}
	
	private void playWithStrings()
	{
		String sample = "Some words are niftier than others";
		String otherValue = "Words";
		int index = -99;
		
		index = sample.indexOf(otherValue);
		
		System.out.println("The index of otherValue in sample is: " + index);
		
		index = otherValue.indexOf(sample);
		
		System.out.println("The index of otherValue in sample is: " + index);
		
		if(index >= 0)
		{
			//Do something because it exists
			//Like change a boolean
			//Or check further
			int otherIndex = sample.indexOf("other search", index + 1);
		}
	}


//	private void askQuestions() 
//	{
//		System.out.println("How is your day?");
//		String dayInput = inputReader.next(); 
//		if(dayInput.equalsIgnoreCase("bad") || dayInput.equalsIgnoreCase("not good") || dayInput.equalsIgnoreCase("not too good") || dayInput.equalsIgnoreCase("not too great") || dayInput.equalsIgnoreCase("not the best") || dayInput.equalsIgnoreCase("terrible") || dayInput.equalsIgnoreCase("no"))
//		{
//			System.out.println("Im sorry your day wasn't the best...");
//		}
//		else System.out.println("Im glad your day is " + dayInput + ("."));
//		inputReader.nextLine(); // Consumes unneeded input text.
//		//--------------------------------------------------------
//		System.out.println("Do you have a favorite type of food?");
//		String foodAnswer = inputReader.next();
//		if (foodAnswer.equalsIgnoreCase("yes"))
//		{
//			System.out.println("What is it?");
//			String foodInput = inputReader.next();
//			System.out.println("Really? " + foodInput + " is my favorite type of food too!");
//		}
//		else System.out.println("Well thats lame!");
//		inputReader.nextLine();
//		//--------------------------------------------------------
//		System.out.println("How old are you?");
//		int ageInput = inputReader.nextInt();
//		if(ageInput > 100)
//		{
//			System.out.println("I think you're lying.");
//		}
//		if(ageInput <= 5)
//		{
//			System.out.println("Where are your parents?");
//		}
//		if(ageInput > 80)
//		{
//			System.out.println("Welcome old timer / more wiser!");
//		}
//		else System.out.println("You're " + ageInput + "? Nice, I am 0101010101010101010101");
//		inputReader.nextLine();
//		//--------------------------------------------------------
//		System.out.println("On a scale of 1-10 how hot do you look today?");
//		float hotnessInput = inputReader.nextFloat();
//		if(hotnessInput < 5.0)
//		{
//			System.out.println("I think you're being a little too hard on yourself...");
//		}
//		if(hotnessInput > 10.0)
//		{
//			System.out.println("Woah, settle down there pal!");
//		}
//		if(hotnessInput > 5.1)
//			if(hotnessInput < 9.9)
//		{	
//			System.out.println(hotnessInput + " is just alright compared to me ;)");
//		}	
//		inputReader.nextLine();
//		//--------------------------------------------------------
//		System.out.println("Do you want to hear a joke?");
//		String jokeAccept = inputReader.next();
//		if(jokeAccept.equalsIgnoreCase("yes") || jokeAccept.equalsIgnoreCase("sure") || jokeAccept.equalsIgnoreCase("yeah") || jokeAccept.equalsIgnoreCase("definatley") || jokeAccept.equalsIgnoreCase("heck yes") || jokeAccept.equalsIgnoreCase("heck yeah")) 
//				{
//			System.out.println("What do you call a computer that can sing?");
//			String jokeInput = inputReader.next();
//			if(jokeInput.equalsIgnoreCase("adell") || jokeInput.equalsIgnoreCase("a dell"))
//			{
//				System.out.println("Wow... you got me. That was my best joke...");
//			}
//			else System.out.println(jokeInput + "? Nope! A Dell :)");
//				}
//		if(jokeAccept.equalsIgnoreCase("no") || jokeAccept.equalsIgnoreCase("no thanks") || jokeAccept.equalsIgnoreCase("eh") || jokeAccept.equalsIgnoreCase("definatley not"))
//		{
//			System.out.println("Tough crowd...");
//		}
//		inputReader.nextLine();
//		//--------------------------------------------------------
//		System.out.println("What kind of shoes do you wear?");
//		String shoeInput = inputReader.next();
//		System.out.println(shoeInput + "? Nice, I dont wear shoes.");
//		inputReader.nextLine();
//		//--------------------------------------------------------
//		System.out.println("What is your favorite season?");
//		String seasonInput = inputReader.next();
//		System.out.println(seasonInput + " is dope.");
//		inputReader.nextLine();
//		//--------------------------------------------------------
//		System.out.println("What kind of car do you drive");
//		String carInput = inputReader.next();
//		System.out.println(carInput + "? I drive a Bugatti, because I can in computer land.");
//		inputReader.nextLine();
//		//--------------------------------------------------------
//		System.out.println("What is your dream job?");
//		String jobInput = inputReader.nextLine();
//		System.out.println(jobInput + " is a nice choice.");
//		inputReader.nextLine();
//		//--------------------------------------------------------
//		System.out.println("From 10-10, how would you rate this game?");
//		int scoreInput = inputReader.nextInt();
//		System.out.println(scoreInput + " is alright, thanks :)");
//		inputReader.nextLine();
//		}
	
}