package com.sunbeam.person;

import java.util.Scanner;

public  class Manager extends Employee {
private int bonus;

public void accept()
{
	super.accept();
	System.out.println("enter bonus=");
	bonus=new Scanner(System.in).nextInt();
}
public void display()
{
	super.display();
	System.out.println(" bonus="+bonus);
}

	 @Override
	 public void calcTotalSalary() {
		 System.out.println("total manger salary="+(super.getSal()+this.bonus));
	}
		
	

}
