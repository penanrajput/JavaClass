import java.io.*;

class Test {
	public static void main(String[] args) {
		// FileOutputStream fin = new FileOutputStream("abc.txt");
		// fin.write("ABCD".getBytes());
		// fin.close();

		/*
		 * // Variation 1 try {
		 * 
		 * BufferedWriter fout = new BufferedWriter(new FileWriter("abc.txt"));
		 * 
		 * fout.write("PENAN IS GOOD BOY"); System.out.println("Done"); fout.close(); }
		 * catch(IOException e) { System.out.println(e); }
		 */

		BufferedWriter fout = null;
		try {

			fout = new BufferedWriter(new FileWriter("abc2.txt"));

			fout.write("Variation 1");
			System.out.println("Done");

		} catch (IOException e) {
			System.out.println(e);
		} finally {
			try {
				if (fout != null)
					fout.close();
			} catch (IOException e) {
				System.out.println("Error closing file");
			}
		}

	}

}