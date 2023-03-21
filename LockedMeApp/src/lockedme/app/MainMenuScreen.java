package lockedme.app;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.util.InputMismatchException;
import java.util.Scanner;
import lockedme.data.WorkFile;

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
	
	public static void getListing()
	{
		listAllFiles();
		System.out.println("List of files retrieved as requested...");
		System.out.println("Returning to main menu now...");
		takeToMainMenu();
	}
	
	public static void promptForFileToAdd()
	{
		try 
		{
			setFileInputToAdd();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("There was an issue processing your request... try again!");
		}
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
		System.out.println("Welcome to LockedMe.com");
		System.out.println("Author: Israel Morales");
		System.out.println("Developed for: Company Lockers Pvt. Ltd.");
		System.out.println("LockedMe.com App: Main Menu");
	}
	
	private static void createMenuOptions()
	{
		System.out.println("1.  List all existing Files");
		System.out.println("2.  Add a File");
		System.out.println("3.  Delete a File");
		System.out.println("4.  Search a File");
		System.out.println("5.  Exit the LockedMe.com App");
	}	
	
	private static void processInput()
	{		
		Scanner inputChoice = new Scanner(System.in);
		
		itemChosen = inputChoice.nextInt();
		do
		{
			switch(itemChosen)
			{
				case 1:  getListing();
						 break;
				case 2:	 promptForFileToAdd();						 
						 break;
				case 3:  promptForFileToDelete();
						 break;
				case 4:  promptForFileToSearch();
						 break;
				case 5:  quitTheApp();
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
	
	private static void setFileInputToAdd() throws FileAlreadyExistsException, IOException
	{
		Scanner fileNameInput = new Scanner(System.in);		
		
		try 
		{
			System.out.println("Please type the name of the file you wish to add:");
			MainMenuScreen.setFileName(fileNameInput.next());
			System.out.println("File entered was " + MainMenuScreen.getFileName());
			WorkFile workFile = new WorkFile();
			workFile.addFile(MainMenuScreen.fileName);			
		}
		catch (NullPointerException npx) 
		{
			System.out.println("Unable to add the new file...");
			System.out.println("Back to main menu...");
			takeToMainMenu();							
		}
		finally
		{
			System.out.println("Add request processed...");
			System.out.println("Returning to main menu...");
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
			WorkFile myFile = new WorkFile();
			myFile.deleteFile(MainMenuScreen.getFileName());			
		}		
		catch (NullPointerException | IOException npx) 
		{
			System.out.println("Unable to delete the specified file...");
			System.out.println("Back to main menu...");
			takeToMainMenu();							
		 }
		finally
		{
			System.out.println("Delete request processed...");
			System.out.println("Returning to main menu...");
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
			setFileName(fileNameInput.next());
			WorkFile myFile = new WorkFile();
			myFile.searchFile(fileName);
		}
		catch (NullPointerException npx) 
		{
			System.out.println("Unable to search for the specified file...");
			System.out.println("Back to main menu...");
			takeToMainMenu();							
		} 
		catch (IOException e) 
		{
			System.out.println("Issues with the requested search...");			
		}
		finally
		{
			System.out.println("Search request processed...");
			System.out.println("Returning to main menu...");
			takeToMainMenu();
		}
		fileNameInput.close();
	}
	
	private static void listAllFiles()
	{
		WorkFile fileListing = new WorkFile();
		fileListing.displayFileList();
	}
	
	public static String getFileName() 
	{
		return MainMenuScreen.fileName;
	}

	public static void setFileName(String fileName) 
	{
		MainMenuScreen.fileName = fileName;
	}

	private static String fileName = null;
	
	private static int screenLevel = 0;
	private static int itemChosen = 0;	
}
