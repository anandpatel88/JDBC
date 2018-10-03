package FileHandelling;

import java.io.File;
import java.io.FileReader;

import org.apache.commons.io.FileUtils;

public class SizeOfFile {

	public static void main(String[] args) {
		File f=new File("C:\\Users\\anand.mohan.patel\\workspace2\\SeleniumDemo\\test.txt");
	long size= FileUtils.sizeOf(f);
	System.out.println(size);
	System.out.println(f.length());

	}

}
