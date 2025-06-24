package Homework;

import java.util.Scanner;

public class TestEmp1 {
	/*
	 101	Sima	Tester	10000
	102	Raj	Dev	20000
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Emp1 emp1[] = new Emp1[2];
		Emp1 obj = new Emp1();
		System.out.println("Enter......");
		for (int i = 0; i < emp1.length; i++) {
			Emp1 t = new Emp1(scan.nextInt(), scan.next(), scan.next(), scan.nextInt());
			emp1[i] = t;
		}
		System.out.println("===================Employee Informatiom===============");
		for (int i = 0; i < emp1.length; i++) {
			System.out.println(emp1[i]);
		}

		System.out.println();
		System.out.println();
		System.out.println("==================Below 70,000 Salray==================");
		// System.out.println("Enter desgnation");
		for (int i = 0; i < emp1.length; i++) {
			if (emp1[i].sal >= 70000) {
				System.out.println(emp1[i]);
			} else {
				System.out.println();
			}
		}

		System.out.println("\n======================Designation=====================");
		System.out.println("\nEnter desgnation");
		for (int i = 0; i < emp1.length; i++) {
			if (emp1[i].desg.equals(scan.next())) {
				System.out.println(emp1[i]);
			} else {
				System.out.println();
			}
		}

		System.out.println("Enter the id := "); // 101
		int  id = scan.nextInt();
		for (int i = 0; i < emp1.length; i++) {
			if (emp1[i].empcode == id) {
				emp1[i].sal = 50_000;
			}
		}

		System.out.println("curret data >> ");

		for (int i = 0; i < emp1.length; i++) {
			System.out.println(emp1[i]);
		}


		System.out.println("Update Salary data >> ");
		for (int i = 0; i < emp1.length; i++) {
			emp1[i].getupdate(emp1[i].desg);
			System.out.println(emp1[i]);
		}

	}

}


