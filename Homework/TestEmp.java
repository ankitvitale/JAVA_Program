
package Homework;

import java.util.Scanner;

public class TestEmp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Emp emp[] = new Emp[2];
		int a;
		String b, c;
		double d;
		System.out.println("============Enter Employee Information============");
		for (int i = 0; i < emp.length; i++) {
			System.out.print("Enter id: ");
			a = scan.nextInt();
			System.out.print("Enter name: ");
			b = scan.next();
			System.out.print("Enter couse: ");
			c = scan.next();
			System.out.print("Enter per: ");
			d = scan.nextDouble();
//			Emp t = new Emp(scan.nextInt(), scan.next(), scan.next(), scan.nextDouble());
			Emp t = new Emp(a, b, c, d);
			emp[i] = t;
		}
		System.out.println("===================================================");
		for (int i = 0; i < emp.length; i++) {
			System.out.println(emp[i]);
		}

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("============Above 70% Marks Student==================");

		for (int i = 0; i < emp.length; i++) {
			if (emp[i].per >= 70) {
				System.out.println(emp[i]);

			} else {
				// System.out.println("No one of student Pass in Above 70");
			}

		}
		System.out.println();
		System.out.println();
		System.out.println("=========================Course======================");
		System.out.println("Enter your course....");
		for (int i = 0; i < emp.length; i++) {
			// System.out.println(emp[i].course);
			// System.out.println("Enter your course....");
			if (emp[i].course.equals(scan.next())) {

				System.out.println(emp[i]);
			} else {
				System.out.println();
			}

		}

		System.out.println();
		System.out.println();
		System.out.println("============below 40% Marks Student==================");

		for (int i = 0; i < emp.length; i++) {
			if (emp[i].per <= 40) {
				System.out.println(emp[i]);

			} else {
				// System.out.println("No one of student Pass in Above 70");
			}

		}

	}

}
