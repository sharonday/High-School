import java.util.Scanner;

public class CarTester {

	public static void main(String[] args) {
		Scanner steve = new Scanner(System.in);
		System.out.println("efficiency: ");
		Car car = new Car(steve.nextDouble());
		System.out.println("gas: ");
		car.addGas(steve.nextDouble());
		System.out.println("drive: ");
		car.drive(steve.nextDouble());
		System.out.println(car.getGasInTank());

	}

}
