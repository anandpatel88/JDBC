package FileHandelling;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CoutingTextPresent {

	public static void main(String[] args) throws IOException
	{
		File f=new File("C:\\Users\\anand.mohan.patel\\workspace2\\SeleniumDemo\\test.txt");
		if(f.exists())
		{
			FileReader fr=new FileReader(f);
			BufferedReader br=new BufferedReader(fr);
			String line="";
			int count=0;
			while((line=br.readLine())!=null)
			{
				String word[]=line.split(" ");
				for(int i=0;i<word.length;i++)
				{
					if(word[i].equalsIgnoreCase("this"))
					{
						count++;
					}
				}
			}
			System.out.println(count);
		}

	}

}
