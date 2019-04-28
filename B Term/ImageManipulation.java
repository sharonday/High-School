import java.awt.Color;

public class ImageManipulation {

	public static void main(String[] args) {
		Picture pic = new Picture();
		// pic.load("Loops/queen-mary.jpg");

		pic.pick();

		for (int x = 0; x < pic.getWidth(); x++) {
			for (int y = 0; y < pic.getHeight(); y++) {
				Color original = pic.getColorAt(x, y);
				int red = 255 - original.getRed();
				int green = 255 - original.getGreen();
				int blue = 255 - original.getBlue();
				Color negative = new Color(red, green, blue);
				pic.setColorAt(x, y, negative);

			}
		}

	}

}
