package FileHandelling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadAndReverseWrite {

	public static void main(String[] args) throws IOException
	{
		File f=new File("C:\\Users\\anand.mohan.patel\\workspace2\\SeleniumDemo\\test1.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String line="";
		StringBuilder sb=new StringBuilder();
		while((line=br.readLine())!=null)
		{
			System.out.println(line);
			sb.append(line);
		}
		fr.close();
		File f1=new File("C:\\Users\\anand.mohan.patel\\workspace2\\SeleniumDemo\\test1.txt");
		FileWriter fw=new FileWriter(f1);
		fw.write(reverse(sb));
		fw.close();
		

	}
	public static String  reverse(StringBuilder sb)
	{
		String s1="";
		for(int i=sb.length()-1;i>=0;i--)
		{
			s1=s1+sb.charAt(i);
		}
		return s1;
		
	}

}
