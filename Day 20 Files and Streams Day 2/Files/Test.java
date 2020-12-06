import java.io.*;
import java.util.*;
class Test
{
	public static void main(String [] args) throws IOException
	{
		/// File f = new File("D:/code/Java/JavaClass");
		File f = new File("Test.java");
		// File f = new File(".");
		// File f = new File("D:/code/Java/JavaClass/Day 20 Files and Streams Day 2/Files");

		System.out.println(f.exists() ? "File exists" : "File doesn't exist");
		System.out.println(f.getName() + " is " + (f.isFile() ? "" : "not ") + "a file");
		System.out.println(f.getName() + " is " + (f.isDirectory() ? "" : "not ") + "a directory");

		if(f.exists())
		{
			System.out.println("  Name of file : " + f.getName());
			System.out.println("  Path of file : " + f.getPath());
			System.out.println("Absolute  Path : " + f.getAbsolutePath());
			// System.out.println("Canonical Path : " + f.getCanonicalPath());
			System.out.println("  is Direcotry : " + f.isDirectory());
			System.out.println("  is File      : " + f.isFile());
			System.out.println("  can Read     : " + f.canRead());
			System.out.println("   is Hidden   : " + f.isHidden());
			System.out.println("  can Write    : " + f.canWrite());
			System.out.println("  can Execute  : " + f.canExecute());
			System.out.println("   parent file : " + f.getParent());
			System.out.println(" last modified : " + f.lastModified());
			Date date = new Date(f.lastModified());
			System.out.println(" last modified : " + date);


			if(f.isDirectory())
			{
				System.out.println("It's Directory.\n\tList out the files in directory");
				// Files show
				// File [] files = new File[10];
				// files = f.listFiles();
				File [] files = f.listFiles();
				// System.out.println(files);
				int i = 0;
				for(File v : files)
				{
					++i;
					// System.out.println(i + " : " + v.getName());
					System.out.printf("%02d : %s\n", i, v.getName());
				}
			}
			else
				System.out.println("It's file so can't list files");

		// Creating Directory
		 // First Checking if Directory exists, if exists, delete it
		 File newDirectory = new File("NewFolder");
		 if(newDirectory.exists())
		 {
			 System.out.println("Folder : NewFolder exists!");
			 newDirectory.delete();
			 // newDirectory.mkdir();
		 }
		 else
		 {
			 System.out.println("Folder : NewFolder Doesn't exitst!");
			 System.out.println("Folder : NewFolder Created");
			 newDirectory.mkdir();
		 }
		}
		else
		{
			System.out.println("Path is invalid!");
		}

		// Rename

		File oldFile = new File("OldFile.txt");
		oldFile.delete();


		File newFile = new File("newFile.txt");
		if(newFile.exists())
		{
			System.out.println(newFile.getName() + " already exists!");

		}
		else
		{
			System.out.println("File : NewFile.txt doesn't exist");
			System.out.println("File : NewFile.txt created");
			newFile.createNewFile();
		}
		System.out.println("Renaming file NewFile.txt -> OldFile.txt");
		// System.out.println(newFile.getParent());

		// newFile.getParent() == null ? newFile.renameTo(new File("OldFile.txt")) : newFile.renameTo(newFile.getParent()+"OldFile.txt");
		// newFile.renameTo(new File(newFile.getParent() + "OldFile.txt"));

		if (newFile.getParent() == null)
		{
			newFile.renameTo(new File("OldFile.txt"));
		}
		else
		{
			newFile.renameTo(new File(newFile.getParent() + "OldFile.txt"));
		}


		File ROFFile = new File("ReadOnlyFile.txt");
		if(!ROFFile.exists())
		{
			ROFFile.createNewFile();
		}

		if(ROFFile.canRead())
		{

			ROFFile.setReadOnly();
			System.out.println(ROFFile.getName() + " is now Read Only");
		}
		else
		{
			System.out.println(ROFFile.getName() + " is already ReadOnly");
		}
	}
}