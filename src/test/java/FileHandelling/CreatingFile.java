package FileHandelling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CreatingFile {

	public static void main(String[] args) throws IOException 
	{
		File f=new File("C:\\Users\\anand.mohan.patel\\workspace2\\SeleniumDemo\\test1.txt");
		if(!f.exists())
		{
			
			f.createNewFile();
		}
		FileWriter fw=new FileWriter(f);
		fw.write("my name is anand");
		fw.close();
		System.out.println("file created and written");

}
}
