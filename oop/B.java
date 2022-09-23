package oop;

import java.util.*;

//
//class B{
//	public static void main(String[] args) {
//		Scanner scan=new Scanner (System.in);
//		System.out.println("Enter the number A=");
//		int a=scan.nextInt();
//		System.out.println("Enter the number B=");
//		int b=scan.nextInt();
//		
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		
//		System.out.println("a="+a);
//		System.out.println("b="+b);
//	}
//}

// factroal progam

//class B{
//	
//	public static void main(String[] args) {
//		
//		
//		int f=1;
//		for(int i=1;i<=5;i++) {
//			f=f*i;
//			
//		}
//		System.out.println(f);
//	}
//	
//}
//


class B{
	public static void main(String[] args) {
		
		int arr[]= {3,2,1,7,5,4};
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the index posstion");
		int index=scan.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(index==i) {
				System.out.println(arr[i]);
			}
			
		}
		
		
	}
}
