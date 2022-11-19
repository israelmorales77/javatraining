package assessmentProject.data;

import java.io.File;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
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
		
				
		// The integer action parameter is based on the menu options (add, delete or search);
		WorkFile.fileName = fileName;
		WorkFile.filePath = path;
		WorkFile.fileAction = action;
		
	}
	
	public static String getRootPath() 
	{
		// TODO Auto-generated method stub
		return WorkFile.MAIN_WORKPATH;
	}

	public File addFile(String fileName) throws FileAlreadyExistsException, NullPointerException 
	{
		
		WorkFile.fileAction = 1;
		
		setPathInfo();
		
		if(fileName.length()>0 && !fileName.isEmpty())
		{
			WorkFile.fileName = fileName;
			directoryPathInfo.resolve(MAIN_WORKPATH.concat(fileName));
			try
			{
				System.out.println("Working on creating your new file");
							
				//workingFile.createNewFile();
			}
			catch(Exception ex)
			{
				System.out.println("There were problems creating a new file");			
			}
			finally
			{
				System.out.println("Your file request has been processed.");
			}
		}
		else
		{
			System.out.println("No filename was specified...");
		}
		
		return workingFile;
	}
	
	public int deleteFile(String fileName) 
	{
		
		WorkFile.fileAction = 2;
		
		setPathInfo();
		getPathInfo();		
		
		if(!fileName.isEmpty() && fileName.length()>0)
		{
			WorkFile.fileName = fileName;
			directoryPathInfo.resolve(MAIN_WORKPATH.concat(fileName));
			
			try
			{			
				workingFile.delete();
			}
			catch(Exception ex)
			{
				System.out.println("Problems deleting the file");
			}
			finally
			{
				System.out.println("Your request has been processed");
			}
		}
		else
		{
			
		}		
		
		return WorkFile.fileActionResult;
	}

	@Override
	public int searchFile() 
	{
		WorkFile.fileAction = 3;
		
		return WorkFile.fileActionResult;
	}
	
	public void displayFileList()
	{
		WorkFile.fileAction = 4;
		createFileList();
	}
	
	public static File getWorkingDirectory()
	{		
		return WorkFile.workingDirectory;
	}
	
	public static Path getPathInfo()
	{
		return WorkFile.directoryPathInfo;
	}
	
	private static void setPathInfo()
	{
		setWorkingDirectory();
		getWorkingDirectory();
		
		WorkFile.directoryPathInfo.resolve(MAIN_WORKPATH);
	}
	
	private static void setWorkingDirectory()
	{
		System.setProperty("user.dir", MAIN_WORKPATH);
		
		WorkFile.workingDirectory = new File(WorkFile.MAIN_WORKPATH);
		
		if(WorkFile.workingDirectory.exists() && WorkFile.workingDirectory.isDirectory())
		{
			WorkFile.workingDirectoryExists = true;
			System.out.println("Root Working directory for files has been set");
		}
		else
		{
			System.out.println("Root Working directory does not exist");
			System.out.println("Creating Root Working directory now...");
			
			WorkFile.workingDirectory = new File(WorkFile.MAIN_WORKPATH);
			setPathInfo();
			getPathInfo();
		}
	}
	
	private static void createFileList()
	{
		SortedSet<File> fileList = new TreeSet<File>();
		
		setWorkingDirectory();
		getWorkingDirectory();
		
		
		
		System.out.println("Generating ascending sorted file list for you...");
		
		while(fileList.iterator().hasNext())
		{
			System.out.println(fileList.toString());
		}
				
	}		
	
	
	public static WorkFile getMyFile() 
	{
		return myFile;
	}

	public static void setMyFile(WorkFile myFile) 
	{
		WorkFile.myFile = myFile;
	}


	private static File workingFile = null;
	private static File workingDirectory = null;
	private static String fileName = null;
	private static String filePath = null;
	private static int fileAction = 0;	
	private static int fileActionResult = 0;
	
	private static Path directoryPathInfo = null;
	
	private static final String MAIN_WORKPATH = "/home/israelmoralesir/Desktop/javaPractice/assessmentProject/dataFiles";
	
	private static boolean workingDirectoryExists = false;
	
	private static WorkFile myFile = null;
		
}
