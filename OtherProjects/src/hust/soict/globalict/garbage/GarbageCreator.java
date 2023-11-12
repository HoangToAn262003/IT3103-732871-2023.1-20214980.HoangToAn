package hust.soict.globalict.garbage;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
public class GarbageCreator {

	public static void main(String[] args) 
			throws IOException
	{
		String filename = "Example.txt";
		byte[] inputBytes = {0};
		long startTime, endTime;
		Path fileName
        = Path.of("C:\\Users\\Admin\\Desktop");
		String str = Files.readString(fileName);
		System.out.print(str);
		String outputString = "";
		
	}

}
