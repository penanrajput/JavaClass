import java.util.*;
import java.io.*;

class Test3// implements FilenameFilter
{
	static FilenameFilter textFilter = new FilenameFilter()
		{
			@Override
			public boolean accept(File dir, String name)
			{
				/*
				String lowercaseName = name;
				if(lowercaseName.endsWith(".java"))
					return true;
				else
					return false;
					*/

				return name.toLowerCase().endsWith(".java");
			}
		};

	public static void main(String [] args)
	{
		File file = new File(".");
		// File [] files = file.listFiles(textFilter);

		// more shortcut
		File [] files = file.listFiles(new FilenameFilter()
		{
			@Override
			public boolean accept(File dir, String name)
			{
				return name.toLowerCase().endsWith(".java");
			}
		});
		for(File v : files)
		{
			System.out.println(v.getName());

		}

	}
}
