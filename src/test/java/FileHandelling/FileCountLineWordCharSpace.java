package FileHandelling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileCountLineWordCharSpace {

	public static void main(String[] args) throws Exception 
	{
		File f=new File("C:\\Users\\anand.mohan.patel\\workspace2\\SeleniumDemo\\test.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String line="";
		int LineCount=0;
		int paraCount=1;
		int charCount=0;
		int wordCount=0;
		while((line=br.readLine())!=null)
		{
			if(line.equals(""))
			{
				paraCount++;
			}
			else
			{
			System.out.println(line);
			LineCount++;
			charCount=charCount+line.length();
			String[] wordlist=line.split(" ");
			wordCount=wordCount+wordlist.length;
					
			
			}
		}
		System.out.println("line count is "+LineCount);
		System.out.println("para count is "+paraCount);
		System.out.println("Char count is "+charCount);
		System.out.println("word count is "+wordCount);

	}

}
