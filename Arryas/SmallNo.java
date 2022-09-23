package Arryas;

public class SmallNo {
	public static void main(String[] args) {
		int a[] = { 11, 22, 3, 8, 1, 9 };
		int small = a[0];
		System.out.println("The orignal no:=");
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] < small)
				small = a[i];
			System.out.println(a[i]+" ");

		}
		System.out.println("Small no in Arrays:=" + small);
	}

}
