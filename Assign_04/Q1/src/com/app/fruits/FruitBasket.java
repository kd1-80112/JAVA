package com.app.fruits;

import java.util.Scanner;

public class FruitBasket {
	public static int menu() {
		int choice;
		System.out.println("----------------------------");
		System.out.println("0.Exit");
		System.out.println("1.Add mango");
		System.out.println("2.Add orange");
		System.out.println("3.Add apple");
		System.out.println("4.dispaly all names");
		System.out.println("5. display all details");
		System.out.println("6.display taste of stale fruits");
		System.out.println("7.mark fruit as stale");
		System.out.println("8.mark all sour fruit stale");
		System.out.println("----------------------------");
		System.out.print("enter choice=");
		choice = new Scanner(System.in).nextInt();
		return choice;

	}


	public static void main(String[] args) {
		System.out.println("enter fruit basket size=");
		int basketsize = new Scanner(System.in).nextInt();
		Fruit[] basket = new Fruit[basketsize];

		int choice;
		int count = 0;
		while ((choice = menu()) != 0) {
			switch (choice) {
			case 1: {
				if (count < basketsize) {
					System.out.println("add mongo");
					Fruit f=new Mango("mangocolor",2.5,"mango");
					basket[count]=(Mango)f;
					basket[count].Taste();
					basket[count].setFresh(true);			
					count++;
				}
				if (count > basketsize) {
					System.out.println("basket is full");
				}
			}
				break;
			case 2: {
				if (count < basketsize) {
					System.out.println("add orange");
					Fruit f=new Orange("Orangecolor",3.5,"orange");
					basket[count]=(Orange)f;
					basket[count].Taste();
					basket[count].setFresh(true);
					count++;
					
					
					
				}
				if (count > basketsize) {
					System.out.println("basket is full");
				}
			}
				break;
			case 3: {
				if (count < basketsize) {
					System.out.println("add Apple");
					Fruit f=new Apple("Applered",4.5,"apple");
					
					basket[count]=(Apple)f;
					basket[count].Taste();
					basket[count].setFresh(true);
				
					
					count++;
				}
				if (count > basketsize) {
					System.out.println("basket is full");
				}
			}
				break;
			case 4:
				for(int i=0;i<basket.length;i++)
				{
					System.out.println(basket[i].getName()+"--"+i);
					System.out.println("*****************");
				}break;
				
			case 5:
			{
				for(int i=0;i<basket.length;i++)
				{
					if(basket[i] instanceof Apple)
					{
						System.out.println("apple=");
						System.out.println(basket[i]);
						if(basket[i].isFresh()==true)
						{
							System.out.println("fruit is fresh");
						}
						System.out.println("===============");
					}
					if(basket[i] instanceof Mango)
					{
						System.out.println("mango=");
						System.out.println(basket[i]);
						if(basket[i].isFresh()==true)
						{
							System.out.println("fruit is fresh");
						}
						System.out.println("===============");
					}
					if(basket[i] instanceof Orange)
					{
						System.out.println("orange=");
						System.out.println(basket[i]);
						if(basket[i].isFresh()==true)
						{
							System.out.println("fruit is fresh");
						}
						System.out.println("===============");
					}
				}
				}break;
				
			case 6:
			{
				for(int i=0;i<basket.length;i++)
				{
					if(basket[i].isFresh()==false)
					{
						System.out.println(basket[i].getName()+"--"+basket[i].Taste()+"---"+i);
					}
					
				}
			}break;
				
				case 7:
				{
					for(int i=0;i<basket.length;i++)
					{
						if(i%2==0)
						{
							basket[i].setFresh(false);
							System.out.println(basket[i].getName()+"--"+i);

						}
					
					}
				}break;
				case 8:
				{
					for(int i=0;i<basket.length;i++)
					{
						if(basket[i].Taste()=="sour")
						{
							basket[i].setFresh(false);
						}
					}
					for(int i=0;i<basket.length;i++)
					{
						if(basket[i].isFresh()==false&&basket[i].Taste()=="sour")
						{
							System.out.println(basket[i].getName()+"--"+basket[i].Taste()+"---"+i);
						}
					}
					
				}break;
			
				
			default:
				System.out.println("enter choice again");
				break;

			}
		}
		
	}
}
