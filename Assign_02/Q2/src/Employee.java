
public class Employee {
	String firstName;
	String lastName;
	Double salary;

	public Employee() {

		this.firstName = "";
		this.lastName = "";
		this.salary = 0.0;
	}

	public Employee(String firstName, String lastName, Double salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	void displayEmployee() {
		System.out.println("-------------------------");
		System.out.println("firstName=" + firstName);
		System.out.println("lastName=" + lastName);
		System.out.println("Yearly Salary=" + salary * 12);
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary1(Double salary) {
		this.salary = salary;
	}

	public void setSalary2(Double salary) {
		this.salary = salary;
	}

}
