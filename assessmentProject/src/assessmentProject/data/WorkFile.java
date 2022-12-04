package assessmentProject.data;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.SortedSet;
import java.util.TreeSet;

public class WorkFile implements FileActions
{
	public WorkFile()
	{
		
	}
	
	public WorkFile(String fileName, String path, int action)
	{
		// Setting the working directory where the files will be located
		
				
		// The integer action parameter is based on the menu options (add=1, delete=2 or search=3);
		WorkFile.setFileName(fileName);
		WorkFile.setFilePath(path);
		WorkFile.setFileAction(action);
		
	}

	public void addFile(String fileName) throws NullPointerException,FileAlreadyExistsException, IOException 
	{
		
		WorkFile.setFileAction(1);		
		setFileName(fileName);
	}
	
	public int deleteFile(String fileName) throws NoSuchFileException, IOException
	{
		
		WorkFile.setFileAction(2);		
		setFileName(fileName);
		
		return WorkFile.fileActionResult;
	}

	public int searchFile() 
	{
		WorkFile.setFileAction(3);
		
		return WorkFile.fileActionResult;
	}
	
	public void displayFileList()
	{
		WorkFile.setFileAction(4);
		createFileList();
	}
	
	public static String getFileName() 
	{
		return WorkFile.fileName;		
	}

	public static String getFilePath() 
	{
		return filePath;
	}

	public static int getFileAction() 
	{
		return fileAction;
	}	

	public static void setFileName(String fileName) 
	{
		WorkFile.fileName = fileName;
		setFilePath(WorkFile.MAIN_WORKPATH);
		System.out.println("Setting path to "+getFilePath());
	}

	public static void setFilePath(String filePath) 
	{
		if(!filePath.isBlank() && !filePath.isEmpty())
		{
			WorkFile.filePath = WorkFile.MAIN_WORKPATH;
			System.out.println("Path is set to "+getFilePath());
		}
		
		try
		{
			WorkFile.directoryPathInfo = Paths.get(WorkFile.filePath.concat(getFileName()));
			System.out.println("Working path set to " + WorkFile.directoryPathInfo.toString());
			switch(getFileAction())
			{
				case 1: Files.createFile(directoryPathInfo);
						break;
				case 2: Files.deleteIfExists(directoryPathInfo);
						break;
				case 3: Files.list(directoryPathInfo);
						break;
				case 4: Files.walk(directoryPathInfo);
						break;
				default: System.out.println("Unable to perform any action");
						break;
			}
			
		}catch (InvalidPathException ipe)
		{
			System.out.println("Had problems setting up your path.  Please try again.");
		}catch (FileAlreadyExistsException aex)
		{
			System.out.println("File already exists.");
		}catch (IOException e) {
			System.out.println("Unable to complete your request...");
		}
		
	}

	public static void setFileAction(int fileAction) 
	{
		WorkFile.fileAction = fileAction;
	}	


	private static void createFileList()
	{
		SortedSet<File> fileList = new TreeSet<File>();
		
				
		
		System.out.println("Generating ascending sorted file list for you...");
		
		while(fileList.iterator().hasNext())
		{
			System.out.println(fileList.toString());
		}
				
	}


	private static String fileName = null;
	private static String filePath = null;
	// For fileAction below, values are 1 to add, 2 to delete, 3 to search and 4 to display sorted list
	private static int fileAction = 0;                  	
	private static int fileActionResult = 0;
	
	private static Path directoryPathInfo = null;
	
	//private static final String MAIN_WORKPATH = "/home/israelmoralesir/Desktop/javaPractice/assessmentProject/dataFiles";
	private static final String MAIN_WORKPATH = "C:\\Users\\imora\\git\\javatraining\\assessmentProject\\dataFiles\\";
	

		
}
