package com.sunbeam.person;

import java.util.Scanner;

public class Person {
private String name;
private int age;
public void accept()
{
	System.out.println("enter name=");
	name=new Scanner(System.in).next();
	System.out.println("enter age=");
	age= new Scanner(System.in).nextInt();
	
}
public void Display()
{
	System.out.println(" name="+name);
	System.out.println(" age="+age);
	
}
@Override
public String toString()
{
	return (name+"----"+age);
	
}


}
