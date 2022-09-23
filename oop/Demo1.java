package oop;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int m=scan.nextInt();
		int n=scan.nextInt();
		int b=1;
		int sum=0;
		int sum1=0;
	
		
		while(b<=n) {
			if(b%m==0) {
				sum1=sum1+b;
				
			}
			else {
				sum=sum+b;
				
			}
			b++;
		}
		System.out.println(sum-sum1);
	}

}

