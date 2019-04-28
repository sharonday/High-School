import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Data {

	public static void main(String[] args) throws FileNotFoundException {
		// Prompt for the input and outfile file names
		Scanner console = new Scanner(System.in);
		String inputFileName = "C:\\Users\\Daya\\Desktop\\txt\\data.txt";
		// Construct the Scanner and PrinterWriter objects for reading and
		// writing
		File inputFile = new File(inputFileName);
		Scanner in = new Scanner(inputFile);
		// Read the input and write the output
		ArrayList<String> data = new ArrayList<String>();
		while (in.hasNext()) {
			data.add(in.next().toLowerCase());
		}
		int milk = 0;
		for (int i = 0; i < data.size(); i++) {
			if (data.get(i).contains("milk") || data.get(i).contains("mllk")) {
				milk++;
			}
		}
		System.out.println("milk " + milk);
		int egg = 0;
		for (int i = 0; i < data.size(); i++) {
			if (data.get(i).contains("egg")) {
				egg++;
			}
		}
		System.out.println("egg " + egg);
		int fruit = 0;
		for (int i = 0; i < data.size(); i++) {
			if (data.get(i).contains("fruit") || data.get(i).contains("banana") || data.get(i).contains("apple")
					|| data.get(i).contains("peach") || data.get(i).contains("cantaloupe")
					|| data.get(i).contains("orange") || data.get(i).contains("lemon")
					|| data.get(i).contains("blueberries") || data.get(i).contains("strawberries")
					|| data.get(i).contains("plum") || data.get(i).contains("raspberries")
					|| data.get(i).contains("watermelon") || data.get(i).contains("mango")
					|| data.get(i).contains("grapefruit") || data.get(i).contains("cherries")|| data.get(i).contains("clementines")) {
				fruit++;
			}
		}
		System.out.println("fruit " + fruit);
		int veg = 0;
		for (int i = 0; i < data.size(); i++) {
			if (data.get(i).contains("vegetable") || data.get(i).contains("veggies") || data.get(i).contains("tomato")
					|| data.get(i).contains("cucumber") || data.get(i).contains("lettuce")
					|| data.get(i).contains("pepper") || data.get(i).contains("carrot")
					|| data.get(i).contains("celery") || data.get(i).contains("broccoli")
					|| data.get(i).contains("potato") || data.get(i).contains("spinach")
					|| data.get(i).contains("onion") || data.get(i).contains("corn") || data.get(i).contains("kale")
					|| data.get(i).contains("cauliflower") || data.get(i).contains("eggplant")
					|| data.get(i).contains("beets") || data.get(i).contains("zucchini")|| data.get(i).contains("brocholi")) {
				veg++;
			}
		}
		System.out.println("veg " + veg);
		int dairy = 0;
		for (int i = 0; i < data.size(); i++) {
			if (data.get(i).contains("cheese") || data.get(i).contains("yogurt") || data.get(i).contains("cream")|| data.get(i).contains("butter")) {
				dairy++;
			}
		}
		System.out.println("non milk dairy " + dairy);
		int meat = 0;
		for (int i = 0; i < data.size(); i++) {
			if (data.get(i).contains("meat") || data.get(i).contains("chicken") || data.get(i).contains("beef")
					|| data.get(i).contains("turkey") || data.get(i).contains("steak") || data.get(i).contains("bacon")
					|| data.get(i).contains("pork")|| data.get(i).contains("cuts")) {
				meat++;
			}
		}
		System.out.println("meat " + meat);
		int bread = 0;
		for (int i = 0; i < data.size(); i++) {
			if (data.get(i).contains("bread") || data.get(i).contains("tortilla")) {
				bread++;
			}
		}
		System.out.println("bread " + bread);
		int cereal = 0;
		for (int i = 0; i < data.size(); i++) {
			if (data.get(i).contains("cereal") || data.get(i).contains("granola")) {
				cereal++;
			}
		}
		System.out.println("cereal/granola " + cereal);
		int pastarice = 0;
		for (int i = 0; i < data.size(); i++) {
			if (data.get(i).contains("pasta") || data.get(i).contains("rice")|| data.get(i).contains("noodles")) {
				pastarice++;
			}
		}
		System.out.println("pasta/rice " + pastarice);
		int paper = 0;
		for (int i = 0; i < data.size(); i++) {
			if (data.get(i).contains("paper")) {
				paper++;
			}
		}
		System.out.println("paper products " + paper);
		int bars = 0;
		for (int i = 0; i < data.size(); i++) {
			if (data.get(i).contains("bars")) {
				bars++;
			}
		}
		System.out.println("granola/cereal bars " + bars);
	}

}
