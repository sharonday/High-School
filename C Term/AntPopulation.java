/**
 * This class models the behavior of an ant population.
 * 
 * @author Daya
 *
 */
public class AntPopulation {

	// data
	private double size;

	// constructors
	/**
	 * Contructs an AntPopulation with a given initial population.
	 * 
	 * @param num
	 *            the initial population
	 */
	public AntPopulation(int num) {
		size = num;
	}

	// methods
	/**
	 * Doubles the population.
	 */
	public void breed() {
		size = size * 2;
	}

	/**
	 * Reduces the population by 10%.
	 */
	public void spray() {
		size = 0.9 * size;
	}

	/**
	 * Returns the current population size.
	 * 
	 * @return the current popultiaon size
	 */
	public double getAnts() {
		return size;
	}
}
