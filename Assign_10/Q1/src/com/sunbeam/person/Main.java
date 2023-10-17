package com.sunbeam.person;

public class Main {
	public static void main(String[] args) {
		Manager m = new Manager();
		m.accept();
		m.display();
		Generic_Box<Employee> GBE = new Generic_Box<Employee>();
		GBE.set(m);
		GBE.get();
		GBE.getSalary();

		Salesman s = new Salesman();
		s.accept();
		s.display();
		Generic_Box<Salesman> SBE = new Generic_Box<Salesman>();
		SBE.set(s);
		SBE.get();
		SBE.getSalary();
		SBE.get().accept();
		SBE.get().display();

//		JoinDate d1 = new JoinDate(1, 1, 2001);
//		d1.display();
//		Generic_Box<JoinDate> JD = new Generic_Box<JoinDate>();
//		JD.set(d1);
//		JD.get().display();
//		JD.get().setDay(10);
//		JD.get().setMonth(05);
//		JD.get().setYear(2099);
//		JD.get().display();
	}

}
