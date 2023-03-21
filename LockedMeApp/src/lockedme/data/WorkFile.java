package lockedme.data;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WorkFile implements FileActions
{

	@Override
	public void addFile(String fileName) throws NullPointerException, FileAlreadyExistsException, IOException 
	{
		// TODO Auto-generated method stub
		if(fileName.length()>0 && !fileName.isBlank())
		{	
			String fullPath = MAIN_WORKPATH.concat(fileName);
			WorkFile.fileFullName = fullPath;
			Path fullFilePath = Paths.get(WorkFile.fileFullName);
			Files.createFile(fullFilePath);
			System.out.println("Your request to add a file is complete...");
			System.out.println("File added to ".concat(fileFullName));
		}
		else
		{
			System.out.println("Invalid File... ");
		}
		
	}

	@Override
	public int deleteFile(String fileName) throws NoSuchFileException, IOException 
	{
		
		int status = 0;
		
		if(fileName.length()>0 && !fileName.isBlank())
		{	
			String fullPath = MAIN_WORKPATH.concat(fileName);
			WorkFile.fileFullName = fullPath;
			Path fullFilePath = Paths.get(WorkFile.fileFullName);			
			if(!fullFilePath.toFile().isDirectory())
			{
				Files.deleteIfExists(fullFilePath);			
				status = 1;
				System.out.println("Your request to remove a file is complete...");
				System.out.println("File removed from ".concat(fileFullName));
				
			}
			else
			{
				status = 0;
			}
		}
		else
		{
			System.out.println("Invalid File... ");
		}
		
		return status;
	}

	@Override
	public int searchFile(String fileName) throws IOException 
	{
		
		int searchStatus = 0;
		
		String fullPath = MAIN_WORKPATH.concat(fileName);
		WorkFile.fileFullName = fullPath;
		Path fullFilePath = Paths.get(WorkFile.fileFullName);			
		if(!fullFilePath.toFile().isDirectory())
		{
			Files.exists(fullFilePath);			
			searchStatus = 1;
			System.out.println("Your request to search a file is complete...");
			System.out.println("File found at ".concat(fileFullName));
			
		}
		else
		{
			searchStatus = 0;
			System.out.println("There was an issue with your request... ");
		}
		
		return searchStatus;
	}

	/** This method will display a list of all files in the working
	 ** directory as it is a primary business requirement in the
	 ** business specifications package provided by the customer.
	 ** @return   Result set with the list of paths that could be
	 **           arranged in alphabetical ascending order	 
	 **/
	
	public List<Path> displayFileList() 
	{
		Path filesPath = Paths.get(MAIN_WORKPATH);
		List<Path> resultSet = null;
		
		try(Stream<Path> walk = Files.walk(filesPath))
		{
			resultSet = walk.filter(Files::isRegularFile).collect(Collectors.toList());					
			Collections.sort(resultSet);
			resultSet.forEach(x -> System.out.println(x));
		} 
		catch (IOException e) 
		{
			System.out.println("Unable to retrieve the list of all files...");			
		}		
		
		return resultSet;
		
	}
	
	private static final String MAIN_WORKPATH = "C:\\Users\\imora\\git\\javatraining\\assessmentProject\\dataFiles\\";
	private static String fileFullName = null;
	
}
