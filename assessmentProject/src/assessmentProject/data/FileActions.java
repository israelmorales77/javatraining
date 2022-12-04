package assessmentProject.data;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.NoSuchFileException;

public interface FileActions 
{	
	//Main business requirement necessities
	void addFile(String fileName) throws NullPointerException,FileAlreadyExistsException, IOException;
	int deleteFile(String fileName) throws NoSuchFileException, IOException;
	int searchFile();
	void displayFileList();
}
