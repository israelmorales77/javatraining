package assessmentProject.app;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.util.InputMismatchException;
import java.util.Scanner;

import assessmentProject.data.WorkFile;

public class MainMenuScreen
{	
	
	public static void main(String[] args) 
	{		
		displayMainScreen();
		getMenuChoice();
	}
	
	public static void showMenuHeader()
	{
		createMenuHeader();
	}
	
	public static void showMenuOptions()
	{
		createMenuOptions();
	}
	
	public static void displayMainScreen() 
	{
		showMenuHeader();
		showMenuOptions();
	}
	
	public static void getMenuChoice()
	{
		processInput();
	}
	
	public static void takeToMainMenu()
	{
		backToMainMenu();
	}
	
	public static void quitTheApp()
	{
		appExitOption();
	}
	
	public static void promptForFileToAdd()
	{
		setFileInputToAdd();
	}
	
	public static String getFileNameString()
	{
		return MainMenuScreen.fileName;
	}
	
	public static void promptForFileToDelete()
	{
		setFileInputToDelete();
	}
	
	public static void promptForFileToSearch()
	{
		setFileInputToSearch();
	}
	
	private static void createMenuHeader()
	{
		System.out.println("LockedMe.com App: Main Menu");
	}
	
	private static void createMenuOptions()
	{
		System.out.println("1.  Add a File");
		System.out.println("2.  Delete a File");
		System.out.println("3.  Search a File");
		System.out.println("4.  Get a Sorted File Listing of Existing Files in Directory");
		System.out.println("5.  Return to Main Menu");
		System.out.println("6.  Exit the LockedMe.com App");
	}	
	
	private static void processInput()
	{
		Scanner inputChoice = new Scanner(System.in);
		
		itemChosen = inputChoice.nextInt();
		do
		{
			switch(itemChosen)
			{
				case 1:	 promptForFileToAdd();						 						 
//						 WorkFile.setFileAction(getFileNameString(),itemChosen);
						 MainMenuScreen.screenLevel = 1;						
						 break;
				case 2:  promptForFileToDelete();
//						 WorkFile.setFileAction(getFileNameString(),itemChosen);
				 		 MainMenuScreen.screenLevel = 2;						 
						 break;
				case 3:  promptForFileToSearch();
//						 WorkFile.setFileAction(getFileNameString(),itemChosen);
						 MainMenuScreen.screenLevel = 3;						 
						 break;
				case 4:  myFile.displayFileList();
//						 WorkFile.setFileAction(getFileNameString(),itemChosen);
						 MainMenuScreen.screenLevel = 4;						 
					     break;
				case 5:  takeToMainMenu();						 
					 	 break;
				case 6:  quitTheApp();
						 break;
				default: System.out.println("Error with your selection");
						 try {
							 	displayMainScreen();
							 	getMenuChoice();
						 } catch (InputMismatchException e) {
							 System.out.println("Error with your selection");
							 displayMainScreen();
							 getMenuChoice();
						 } catch (Exception e) {
							 System.out.println("Error with your selection");
							 displayMainScreen();
							 getMenuChoice();
						 }
						 break;
			}
		}
		while(inputChoice.hasNextInt());
		
		
		inputChoice.close();
	}	

	private static void backToMainMenu() 
	{		
		//Takes user back to main menu per fourth option in the requirements list
		 if(MainMenuScreen.screenLevel == 0)
		 {
			 System.out.println("You're already at the main menu...");
			 displayMainScreen();
			 getMenuChoice();

		 }
		 else
		 {
			 System.out.println("Taking you back to LockedMe.com App Main Menu as requested...");
			 displayMainScreen();
			 getMenuChoice(); 
		 }
	}
	
	private static void appExitOption()
	{
		 Scanner exitConfirmation = new Scanner(System.in);
		
		 MainMenuScreen.screenLevel = 0;
		 
		 System.out.println("You have requested to exit the application...");
		 System.out.println("Are you sure? (Y/N)");		 
		 
		 if(exitConfirmation.next().matches("[Yy]"))
		 {
			 System.out.println("Exiting the application as requested...");
			 System.exit(0);
		 }
		 
		 if(exitConfirmation.next().matches("[Nn]"))
		 {
			 System.out.println("Returning to the main menu...");	 
			 takeToMainMenu();
		 }
		 
		 exitConfirmation.close();
			 
	}
	
	private static void setFileInputToAdd()
	{
		Scanner fileNameInput = new Scanner(System.in);		
		
		try 
		{
			System.out.println("Please type the name of the file you wish to add:");
			MainMenuScreen.fileName = fileNameInput.next();
			System.out.println("File entered was " + MainMenuScreen.fileName);
			WorkFile.setFileName(MainMenuScreen.fileName);
			//System.out.println("Will process file " + WorkFile.getFileName());
			//WorkFile.setFilePath(WorkFile.getFileName());
			myFile = new WorkFile(MainMenuScreen.fileName, WorkFile.getFilePath(), 1);
			myFile.addFile(MainMenuScreen.fileName);					
		}
		catch (FileAlreadyExistsException e1) 
		{
			// TODO Auto-generated catch block
			System.out.println("File already exists...");
			System.out.println("Back to main menu...");
			takeToMainMenu();
		}
		catch (NullPointerException npx) 
		{
			System.out.println("Unable to add the new file...");
			System.out.println("Back to main menu...");
			takeToMainMenu();							
		 } catch (IOException e) {
			System.out.println("Something went wrong with your request...");
			System.out.println("Back to Main Menu");
			takeToMainMenu();
		}
		fileNameInput.close();
	
	}
	
	private static void setFileInputToDelete()
	{
		Scanner fileNameInput = new Scanner(System.in);
		
		try 
		{
			System.out.println("Please type the name of the file you wish to delete:");
			MainMenuScreen.fileName = fileNameInput.next();
			WorkFile.setFileName(MainMenuScreen.getFileNameString());
			//System.out.println("Processing your request for " + getFileNameString());
			myFile = new WorkFile(MainMenuScreen.fileName, WorkFile.getFilePath(), 2);
			myFile.deleteFile(MainMenuScreen.getFileNameString());			
		}		
		catch (NullPointerException | IOException npx) 
		{
			System.out.println("Unable to delete the specified file...");
			System.out.println("Back to main menu...");
			takeToMainMenu();							
		 }
		
		fileNameInput.close();
	}
	
	private static void setFileInputToSearch()
	{
		Scanner fileNameInput = new Scanner(System.in);
		
		try 
		{
			System.out.println("Please type the name of the file you wish to search for:");
			MainMenuScreen.fileName = fileNameInput.next();
			getFileNameString();
			myFile = new WorkFile(MainMenuScreen.fileName, WorkFile.getFilePath(), 3);
			myFile.searchFile();
		}
		catch (NullPointerException npx) 
		{
			System.out.println("Unable to search for the specified file...");
			System.out.println("Back to main menu...");
			takeToMainMenu();							
		 }
		fileNameInput.close();
	}
	
	private static String fileName = null;
	
	private static int screenLevel = 0;
	private static int itemChosen = 0;	
	
	private static WorkFile myFile = null;
}
