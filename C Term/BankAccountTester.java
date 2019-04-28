
public class BankAccountTester {

	public static void main(String[] args) {
		BankAccount bank = new BankAccount();
		bank.deposit(1000);
		bank.withdraw(500);
		bank.withdraw(400);
		System.out.println("expected: $" + 100);
		System.out.println("actual: $" + bank.getBalance());
		
		BankAccount momsSavings = new BankAccount(1000);
		momsSavings.addInterest(10);
		System.out.println("expected: $" + 1100);
		System.out.println("actual: $" + momsSavings.getBalance());

	}

}
