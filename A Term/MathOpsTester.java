
public class MathOpsTester 
{

	public static void main(String[] args) 
	{
		intMathMethods();
		decMathMethods();
		doublePrecision();
		integerOverflow();
	   }

		public static void intMathMethods()
		{
			int a = 0;
			int b = 25;
			int c = 10;

			System.out.println("Question #2: intMathMethods()");
			a = b + c;					// Addition
			System.out.println(b + " + " + c + " = " + a); 
			a = b - c;					// Subtraction
			System.out.println(b + " - " + c + " = " + a); 
			a = b * c;					// Multiplication
			System.out.println(b + " * " + c + " = " + a);
			a = b / c;					// Integer Division
			System.out.println(b + " / " + c + " = " + a);
			a = b % c;					// Remainder Division
			System.out.println(b + " % " + c + " = " + a);
	 		System.out.println();
	 		
		}
	 	public static void decMathMethods()
	 		{
	 			double d1 = 0;
	 			double d2 = 10.0;
	 			double d3 = 3.33333333;
	 	      
	 			System.out.println("Question #3: decMathMethods()");
	 			d1 = d2 + d3;                                    
	 			System.out.println(d2 + " + " + d3 + " = " + d1);
	 		d1 = d2 - d3;                                    
	 		System.out.println(d2 + " - " + d3 + " = " + d1);
	 		d1 = d2 * d3;                                    
	 			System.out.println(d2 + " * " + d3 + " = " + d1);
	 		d1 = d2 / d3;                                    
	 		System.out.println(d2 + " / " + d3 + " = " + d1);
	 		System.out.println();
	 	 }
	 	public static void doublePrecision()
	 	{
	 		double num1 = 10.0;
	 		double num2 = 3.0;
	 		double num3 = num1 / num2;
	 		
	 		System.out.println("Question #4: doublePrecision()");
	 		System.out.println("num1: " + num1);
	 		System.out.println("num2: " + num2);
	 		System.out.println("num3: " + num3);
	 			
	 		System.out.println();	
	 		
	 		double f = 4.35;
	 		System.out.println(100 * f);

	 	}
	 	public static void integerOverflow()
	 	{
	 		System.out.println("Question #6: integerOverflow()");

	 		int intNum = 1000;
	 		System.out.println("intNum: " + intNum);
	 			
	 		intNum = intNum * 1000;
	 		System.out.println("intNum: " + intNum);
	 			
	 		intNum = intNum * 1000;
	 		System.out.println("intNum: " + intNum);
	 			
	 		intNum = intNum * 1000;
	 		System.out.println("intNum: " + intNum);
	 		
	 		
	 		int m = 18;
	 		int n = 4;
	 		double x = 2.5;
	 		double y = -1.5;

	 		System.out.println(x + n * y - (x + n) * y);
	 		System.out.println(m / n + m % n);
	 		System.out.println(5 * x - n / 5);
	 		System.out.println(Math.sqrt(Math.sqrt(n)));
	 		System.out.println((int) Math.round(x));
	 		System.out.println((int) Math.round(x) + (int) Math.round(y));
	 		System.out.println((1 - (1 - (1 - (1- (1 - n))))));
	 		
	 		
	 		float xx = -4.49f;
	 		System.out.println((int) (xx + 0.5));
	 		System.out.println((int) Math.round(xx));
	 	}

}