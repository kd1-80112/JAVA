//Q2. Copy the Point2D class , along with the package from previous assignment.
//a) Create a class "TestPointArray1.java" in "tester" package for the following
//b) Accept , how many no of points to plot from user.
//c) Create suitable data structure
//Hint : Point2D[] points=new Point2D[sc.nextInt()];
//d) Prompt user for x & y co ordinates n store the data suitably
//Hint : for loop
//e) Supply Menu to user with various Options like following
//1. Display details of a specific point
//User i/p : index
//O/p : x & y co-ordinates should be displayed. or error message(eg : Invalid index , pls retry!!!!)
//2) Display x, y co-ordinates of all points
//Hint : for-each
//3) User i/p : 2 indices for the points , validate the indices
//Display distance between specified points (iff they are not located at the same position)
//eg : sop("Enter index of strt point n end point");
//validation : boundary condition (0<=index<length-1)
//isEqual -- false --compute distance --display it.
//4. Exit

package com.app.tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPointArray1 {

	public static void main(String[] args) {
//		Point2D[] point = new Point2D[2];
//		point[0] = new Point2D(1, 2);
//		point[1] = new Point2D(3, 4);
		System.out.println("totalpoints=");
		int totalpoints = new Scanner(System.in).nextInt();
		Point2D[] point = new Point2D[totalpoints];
		for (int i = 0; i < totalpoints; i++) {
			point[i] = new Point2D();

		}
		for (int i = 0; i < totalpoints; i++) {
			point[i].accept();

		}5

		int choice;
		Point2D[] arr = new Point2D[2];
		while ((choice = menu()) != 0) {
			switch (choice) {
			case 1: {
				System.out.println("index=");
				int index = new Scanner(System.in).nextInt();
				point[index].disply();
			}
				break;
			case 2: {
				for (int i = 0; i < totalpoints; i++) {
					point[i].disply();
				}
			}
				break;
			case 3: {
				System.out.println("index 1=");
				int index1 = new Scanner(System.in).nextInt();
				System.out.println("index 2=");
				int index2 = new Scanner(System.in).nextInt();
				if (point[index1].isEqual(point[index2])) {
					System.out.println("points have same co-ordinates");
				} else {
					System.out.println(point[index1].calculateDistance(point[index2]));
				}

			}
				break;

			default:
				System.out.println("enter choice again");
				break;
			}
		}

	}

	public static int menu() {
		int choice;
		System.out.println("0.exit");
		System.out.println("1.details at specific point");
		System.out.println("2.display all");
		System.out.println("3. validate indices");
		System.out.println("choice=");
		choice = new Scanner(System.in).nextInt();
		return choice;
	}

}
