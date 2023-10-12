
public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1 = new Employee("Bruce", "wayne", (double) 1000);
		Employee e2 = new Employee("Walter", "white", (double) 5000);
		e1.displayEmployee();
		e2.displayEmployee();
		System.out.println("-------------------------");
		System.out.println("after 10% raise");
		double newsalary1 = e1.getSalary() + e1.getSalary() * 10 / 100;
		double newsalary2 = e2.getSalary() + e2.getSalary() * 10 / 100;
		e1.setSalary1(newsalary1);
		e2.setSalary2(newsalary2);

		e1.displayEmployee();
		e2.displayEmployee();
	}

}
