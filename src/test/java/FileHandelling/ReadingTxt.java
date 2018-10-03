package FileHandelling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadingTxt {

	public static void main(String[] args) throws Exception 
	{
		File f=new File("C:\\Users\\anand.mohan.patel\\workspace2\\SeleniumDemo\\test.txt");
		if(f.exists())
		{
			FileReader fr=new FileReader(f);
			BufferedReader br=new BufferedReader(fr);
			String line="";
			StringBuilder sb=new StringBuilder();
			while((line=br.readLine())!=null)
			{
				System.out.println(line);
				sb.append(line+ '\n');
			}
			System.out.println(sb);
		}
		
		else
		{
			System.out.println("file is not present");
		}

	}

}
