package Arryas;

public class Rverse {
	public static void main(String[] args) {
		int a[]= {5,9,3,7,2,1};
		System.out.println("The orignal Array");
		for(int i=0;i<a.length;i++) {
			System.out.print(" "+a[i]);
			
		}
		System.out.println();
		
		System.out.print("The reverse array");
		for(int j=a.length-1;j>=0;j--) {
			System.out.print(" "+a[j]);
		}
		
	}

}
