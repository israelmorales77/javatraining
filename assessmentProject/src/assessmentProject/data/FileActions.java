package assessmentProject.data;

import java.io.File;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;

public interface FileActions 
{	
	//Main business requirement necessities
	File addFile(String fileName) throws FileAlreadyExistsException;
	int deleteFile(String fileName);
	int searchFile();
	void displayFileList();
}
