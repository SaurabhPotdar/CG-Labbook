
public class BankAccount {
	
	private String firstName;
	private String lastName;
	private double salary;
	
	public BankAccount(String firstName, String lastName, double salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public double getSalary() {
		return salary;
	}
	
	public double deposit(double a) {
		return salary+a; 
	}
	
	public double withdraw(double a) {
		return salary-a;
	}


}
