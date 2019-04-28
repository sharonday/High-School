
public class Triangle {

	private int width;

	public Triangle(int aWidth) {

		width = aWidth;

	}

	public int getArea() {

		if(width == 1){
			return 1;
		}
		Triangle smaller = new Triangle(width - 1);
		int smallerArea = smaller.getArea();
		
		return smallerArea + width;

	}
}