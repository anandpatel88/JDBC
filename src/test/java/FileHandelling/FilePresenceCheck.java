package FileHandelling;

import java.io.File;

public class FilePresenceCheck {

	public static void main(String[] args) throws Exception 
	{
		File f=new File("C:\\Users\\anand.mohan.patel\\workspace2\\SeleniumDemo\\test.txt");
		if(f.exists())
		{
			System.out.println("file is present");
		}
		
		else
		{
			System.out.println("file is not present");
		}

	}

}
