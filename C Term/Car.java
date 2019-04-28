/**
 * This class models the gas tank levels of a car.
 * 
 * @author Daya
 *
 */
public class Car {

	// data
	private double efficiency;
	private double dist;
	private double tank;

	// constructor
	/**
	 * Constructs a car with a given fuel efficiency.
	 * 
	 * @param eff
	 *            the fuel efficiency in miles/gallon
	 */
	public Car(double eff) {
		efficiency = eff;
	}

	// methods
	/**
	 * Adds a given number of gallons to the tank.
	 * 
	 * @param gas
	 *            the number of gallons to add
	 */
	public void addGas(double gas) {
		tank += gas;
	}

	/**
	 * Adds a given distance to the car and updates the gas tank to the
	 * appropriate level.
	 * 
	 * @param miles
	 *            the number of miles to drive
	 */
	public void drive(double miles) {
		dist = miles;
		tank -= dist / efficiency;
	}

	/**
	 * Returns the current amount of gas in the car's tank
	 * 
	 * @return the current gas level
	 */
	public double getGasInTank() {
		return tank;
	}
}
