package lockedme.data;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.List;

public interface FileActions 
{	
	//Main business requirement necessities
	void addFile(String fileName) throws NullPointerException,FileAlreadyExistsException, IOException;
	int deleteFile(String fileName) throws NoSuchFileException, IOException;
	int searchFile(String fileName) throws IOException;
	List<Path> displayFileList();
}
