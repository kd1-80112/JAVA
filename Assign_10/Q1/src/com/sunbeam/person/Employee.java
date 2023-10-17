package com.sunbeam.person;

import java.util.Scanner;

public abstract class Employee extends Person {
	private int id;
	private int sal;
	
	public void accept()
	{
		System.out.println("enter id=");
		id=new Scanner(System.in).nextInt();
		System.out.println("enter sal=");
		sal=new Scanner(System.in).nextInt();
	}
	public void display()
	{
		System.out.println(" id="+id);
		System.out.println(" sal="+sal);
	}
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	abstract public void calcTotalSalary();
	
}
