package Arryas;

public class LargeNumber {
	public static void main(String[] args) {
		int a[] = {
				3,6,8,2,5,4,1};
		int Large = a[0];
		System.out.print("Array of Number:-");
		for (int i = 0; i < a.length; i++) {
			
			System.out.println(""+a[i]);
			if (a[i] > Large) {
				Large = a[i];
			}
	}
		System.out.println(" The Large Number:="+Large);

	}

}
