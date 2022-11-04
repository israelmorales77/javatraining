package assessmentProject.app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TitleScreen 
{
	
	public static String optionChosen = null;
	
	private static void displayWelcomeMessage()
	{				
		String welcomeMessage = "Welcome to Cart: A Product Ordering App";
		System.out.println(welcomeMessage);
		String developerMessage = "Cart has been written by Israel Morales";
		System.out.println(developerMessage);
		String continueMessage = "To proceed to the Main Menu please press c...";
		System.out.println(continueMessage);
		String exitMessage = "To exit the application please press x...";
		System.out.println(exitMessage);
	}
	public static void getWelcomeMessage()
	{
		displayWelcomeMessage();
	}
	private static void generateMainScreen() throws InputMismatchException
	{
		Scanner inputChoice = new Scanner(System.in);
		
		getWelcomeMessage();		
		
		try
		{			
			optionChosen = inputChoice.next();
			if(optionChosen.matches("x") || optionChosen.matches("X"))
			{
				System.out.println("Exiting the application as requested...");
			}
			else if(optionChosen.matches("c") || optionChosen.matches("C"))
			{
				System.out.println("Going to the application main menu as requested...");
			}
		}
		catch(InputMismatchException ex)
		{
			System.out.println("Ooops! Try again!");			
		}
		
		inputChoice.close();		
	}
	
	public static void displayMainScreen() throws Exception
	{
		generateMainScreen();
	}
	
	public static void main(String[] args) throws Exception
	{
		displayMainScreen();
		System.exit(0);
	}
	
}
