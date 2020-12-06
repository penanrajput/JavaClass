import java.util.*;
import java.io.*;

class Test2
{
	public static void main(String [] args)
	{
		File file = new File(".");
		File [] files = file.listFiles();
		System.out.println("FileName\tSize\t\tDate\t\t\t\tType");
		for ( File v : files)
		{
			//System.out.printf("\n%s\t\t%l", v.getName(), v.getTotalSpace());
			String isFileFolder = null;
			if(v.isFile())
				isFileFolder = "File";
			else
				isFileFolder = "Folder";
			Date d = new Date(v.lastModified());
			System.out.println(v.getName()+"\t" + v.length() + " bytes" + "\t" + d + "\t" + isFileFolder);
		}
	}
}