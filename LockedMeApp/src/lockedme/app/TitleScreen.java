package lockedme.app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TitleScreen 
{
	
	public static String optionChosen = null;
	
	private static void displayWelcomeMessage()
	{				
		String welcomeMessage = "Welcome to the LockedMe.com App";
		System.out.println(welcomeMessage);
		String developerMessage = "This LockedMe.com product has been written by Israel Morales";
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
	
	public static void processInput()
	{
		Scanner inputChoice = new Scanner(System.in);
				
		optionChosen = inputChoice.next();
		do
		{
			if(optionChosen.matches("x") || optionChosen.matches("X"))
			{
				System.out.println("Exiting the application as requested...");
				System.exit(0);
			}
			else if(optionChosen.matches("c") || optionChosen.matches("C"))
			{
				System.out.println("Going to the application main menu as requested...");				
				try 
				{
					inputChoice.reset();
					MainMenuScreen.displayMainScreen();					
				} catch (Exception e) 
				{
					System.out.println("There was an error with your request...");
				}
			}
			else
			{
				System.out.println("Error with your selection");
				try {
					inputChoice.reset();
					displayMainScreen();
				} catch (InputMismatchException e) {
					e.printStackTrace();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		while(!optionChosen.matches("x") && !optionChosen.matches("X") && !optionChosen.matches("c") && !optionChosen.matches("C"));
		inputChoice.close();
	}
	
	private static void generateMainScreen()
	{
		getWelcomeMessage();		
		processInput();
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
