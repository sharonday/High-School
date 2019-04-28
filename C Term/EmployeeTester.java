
public class EmployeeTester {

	public static void main(String[] args) {
		Employee shelly = new Employee("Sheldon Cooper", 50000);
		System.out.println(shelly.getName());
		System.out.println(shelly.getSalary());
		shelly.raiseSalary(10); 
		System.out.println(shelly.getSalary());


	}

}
