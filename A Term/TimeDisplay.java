
public class TimeDisplay {

	public static void main(String[] args) {
		System.out.println("Lab02: The Time Display Program.\n");
		
		int i = 12345678;
		
		System.out.println("Starting milliseconds:	" + i);
		
		int mm = i % 1000;
		int s = (i / 1000) % 60;
		int m = (i / 60000) % 60;
		int h = (i / 1000) / 3600;
		
		System.out.println("Hours:			" + h);
		System.out.println("Minutes:		" + m);
		System.out.println("Seconds:		" + s);
		System.out.println("Milliseconds:		" + mm);
		

	}

}
