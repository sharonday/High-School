import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class BabyNames {

	public static void main(String[] args) throws FileNotFoundException {
		// Prompt for the input and outfile file names
		Scanner console = new Scanner(System.in);
		System.out.print("Input file: ");
		String inputFileName = console.next();
		// Construct the Scanner and PrinterWriter objects for reading and
		// writing
		File inputFile = new File(inputFileName);
		Scanner in = new Scanner(inputFile);
		// name math for 1990s
		double maletotal = in.nextInt();
		double femtotal = in.nextInt();
		int mcount = 0;
		int gcount = 0;
		for(int i = 0; i < 200; i++) {
			int rank = in.nextInt();
			String boy = in.next();
			mcount += in.nextInt();
			String girl = in.next();
			gcount += in.nextInt();
			double mpcent = mcount/maletotal;
			double fpcent = gcount/femtotal;
			if(mpcent <= 0.5 && fpcent <= 0.5){
				System.out.println(rank + " " + boy + " 	" + girl);
			}else if (mpcent <= 0.5){
				System.out.println(rank + " " + boy);
			}else if (fpcent <= 0.5){
				System.out.println(rank + " 		" + girl);
			}
			
		}
	}

}
