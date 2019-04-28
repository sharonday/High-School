import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) throws FileNotFoundException {
		// Prompt for the input and outfile file names
		Scanner console = new Scanner(System.in);
		System.out.print("Input file: ");
		String inputFileName = console.next();
		System.out.print("Output file: ");
		String outputFileName = console.next();
		// Construct the Scanner and PrinterWriter objects for reading and
		// writing
		File inputFile = new File(inputFileName);
		Scanner in = new Scanner(inputFile);
		PrintWriter out = new PrintWriter(outputFileName);
		// Read the input and write the output
		int ccount = 0;
		int wcount = 0;
		int lcount = 0;
		while (in.hasNextLine()) {
			in.nextLine();
			lcount++;
			while (in.hasNext()) {
				String word = in.next();
				wcount++;
				for(int i = 0; i < word.length(); i++){
					ccount++;
				}
				
			}
		}
		out.println("Character Count (excluding spaces): " + ccount);
		out.println("Word Count: " + wcount);
		out.println("Line Count: " + lcount);

		in.close();
		out.close();
	}
}