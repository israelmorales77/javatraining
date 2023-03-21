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
//						 WorkFile.setFileAction(getFileName(),itemChosen);
						 MainMenuScreen.screenLevel = 1;						
						 break;
				case 2:  promptForFileToDelete();
//						 WorkFile.setFileAction(getFileName(),itemChosen);
				 		 MainMenuScreen.screenLevel = 2;						 
						 break;
				case 3:  promptForFileToSearch();
//						 WorkFile.setFileAction(getFileName(),itemChosen);
						 MainMenuScreen.screenLevel = 3;						 
						 break;
				case 4:  myFile.displayFileList();
//						 WorkFile.setFileAction(getFileName(),itemChosen);
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
	
	private static void setFileInputToAdd() throws FileAlreadyExistsException, IOException
	{
		Scanner fileNameInput = new Scanner(System.in);		
		
		try 
		{
			System.out.println("Please type the name of the file you wish to add:");
<<<<<<< HEAD
			MainMenuScreen.setFileName(fileNameInput.next());
			System.out.println("File entered was " + MainMenuScreen.getFileName());
			WorkFile.setFileName(MainMenuScreen.getFileName());
			System.out.println("Will process file " + WorkFile.getFileName());
			myFile = new WorkFile(MainMenuScreen.getFileName(), WorkFile.getFilePath(), 1);
			myFile.addFile(MainMenuScreen.fileName);					
=======
			MainMenuScreen.fileName = fileNameInput.next();
			System.out.println("Working your request to add file ... "+getFileNameString().toString());
			System.out.println("Accessing working path at ... "+WorkFile.getRootPath());
			WorkFile.setMyFile(new WorkFile(fileName,WorkFile.getRootPath().concat(fileName),1));
			myFile.addFile(getFileNameString());
		}
		catch (FileAlreadyExistsException e1) 
		{
			// TODO Auto-generated catch block
			System.out.println("File already exists...");
			System.out.println("Back to main menu...");
			takeToMainMenu();
>>>>>>> refs/remotes/origin/main
		}
		catch (NullPointerException npx) 
		{
			System.out.println("Unable to add the new file...");
			System.out.println("Back to main menu...");
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
<<<<<<< HEAD
			MainMenuScreen.fileName = fileNameInput.next();
			WorkFile.setFileName(MainMenuScreen.getFileName());
			//System.out.println("Processing your request for " + getFileName());
			myFile = new WorkFile(MainMenuScreen.fileName, WorkFile.getFilePath(), 2);
			myFile.deleteFile(MainMenuScreen.getFileName());			
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
			setFileName(fileNameInput.next());
			myFile = new WorkFile(MainMenuScreen.getFileName(), WorkFile.getFilePath(), 3);
			myFile.searchFile();
=======
			MainMenuScreen.fileName = fileNameInput.next();			
			System.out.println("Processing you deletion request of file... "+getFileNameString());
			myFile.deleteFile(getFileNameString());
>>>>>>> refs/remotes/origin/main
		}
		catch (NullPointerException npx) 
		{
			System.out.println("Unable to search for the specified file...");
			System.out.println("Back to main menu...");
			takeToMainMenu();							
		 }
		fileNameInput.close();
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
	
	private static WorkFile myFile = null;
}
