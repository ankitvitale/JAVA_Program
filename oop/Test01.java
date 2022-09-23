package oop;

import java.util.Scanner;

public class Test01 {
	int id;
	String name;
	int BA;
	double DA;
	int HRA;

	void getdata() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the id of employes");
		int id = scan.nextInt();
		System.out.println("Enter name of employes");
		String name = scan.next();
		System.out.println("Enter the BasicSalary");
		int BA = scan.nextInt();
		System.out.println("Enter the drarness allowance");
		double DA = scan.nextDouble();
		System.out.println("Enter the house rent allowance");
		double HRA = scan.nextDouble();
	}

	double getDa() {
	//	double DA = 20 / 100.0 * BA;
			double DA = 1000;
		System.out.println("DA is "+DA);
		return DA;

	}

	double getHRA() {

	//	double HRA = 10 / 100.0 * BA;
	double HRA=1500;
	System.out.println("HRA is "+HRA);
		return HRA;
	}
	
	double getgrossSAl(
			
			) {
		double gross=getDa()+getHRA()+BA;
		
		System.out.println("The gross Salary:-"+gross);
		
		return gross;
	}
	

}
