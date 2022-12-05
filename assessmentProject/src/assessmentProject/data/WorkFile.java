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
		WorkFile.setFileAction(fileName,action);
		
	}

	public void addFile(String fileName) throws NullPointerException,FileAlreadyExistsException, IOException 
	{
		WorkFile.setFileName(fileName);
		WorkFile.setFileAction(WorkFile.getFileName(),1);				
	}
	
	public int deleteFile(String fileName) throws NoSuchFileException, IOException
	{
		WorkFile.setFileName(fileName);
		WorkFile.setFileAction(WorkFile.getFileName(),2);				
		
		return WorkFile.fileActionResult;
	}

	public int searchFile() 
	{
		WorkFile.setFileAction(WorkFile.getFileName(),3);
		
		return WorkFile.fileActionResult;
	}
	
	public void displayFileList()
	{
		WorkFile.setFileAction(WorkFile.getFileName(),4);
		
		WorkFile.createFileList();
	}
	
	public static String getFileName() 
	{
		return WorkFile.fileName;		
	}

	public static String getFilePath() 
	{
		return WorkFile.filePath;
	}

	public static int getFileAction() 
	{
		return WorkFile.fileAction;
	}	

	public static void setFileName(String fileName) 
	{
		WorkFile.setFilePath(WorkFile.MAIN_WORKPATH);		
		
//		WorkFile.fileName = WorkFile.getFilePath().concat(fileName); 				
		
		Path tmpDirectoryPathInfo = Paths.get(WorkFile.getFilePath());
		
		WorkFile.directoryPathInfo = tmpDirectoryPathInfo.resolve(fileName);
		
		System.out.println("Working request for "+ directoryPathInfo.toString());		
	}

	public static void setFilePath(String filePath) 
	{
		if(!filePath.isBlank() && !filePath.isEmpty())
		{
			WorkFile.filePath = WorkFile.MAIN_WORKPATH;			
		}		
		
		System.out.println("Setting path to " + directoryPathInfo.toString());
	}

	public static void setFileAction(String fullPath, int fileAction) 
	{
		WorkFile.fileName = fullPath;
		WorkFile.fileAction = fileAction;		
		WorkFile.processFileAction(WorkFile.getFileName(),WorkFile.getFileAction());
	}	

	private static void processFileAction(String fileName, int actionValue)
	{
		try
		{
			
			switch(actionValue)
			{
				case 1: Files.createFile(directoryPathInfo);
						WorkFile.fileActionResult=(Files.exists(directoryPathInfo)?1:0);
						String statusMessage = (WorkFile.getFileAction()==1?"File added":"File not added");
						System.out.println(statusMessage);
						break;
				case 2: Files.delete(directoryPathInfo);
						String deleteStatusMessage = (WorkFile.getFileAction()==1?"File removed":"File not removed");
						System.out.println(deleteStatusMessage);
						WorkFile.fileActionResult=(Files.notExists(directoryPathInfo)?0:1);						
						break;
				case 3: Files.list(directoryPathInfo);
						break;
				case 4: Files.walk(directoryPathInfo);
						break;
				default: System.out.println("Unable to perform any action");
						break;
			}
			
		}catch (NoSuchFileException nsf){
			System.out.println("The specified file does not exist...");
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
