/**
 * This class creates an employee with a name and a salary.
 * 
 * @author Daya
 *
 */
public class Employee {

	// data
	private double salary;
	private String name;

	// constructors
	/**
	 * Constructs an Employee with a given name and a given salary.
	 * 
	 * @param employeeName
	 *            the employee's name
	 * @param currentSalary
	 *            the employee's current salary
	 */
	public Employee(String employeeName, double currentSalary) {
		salary = currentSalary;
		name = employeeName;
	}

	// methods
	/**
	 * Returns the employee's name
	 * 
	 * @return the employee's name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Returns the employee's current salary.
	 * 
	 * @return the employee's current salary
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * Raises the employee's salary by a given percentage.
	 * 
	 * @param byPercent
	 *            the percentage by which the salary is raised
	 */
	public void raiseSalary(double byPercent) {
		double per = byPercent / 100;
		salary += salary * per;
	}
}
