package Arryas;

public class EvenIndexPlaced {
	public static void main(String[] args) {
		int arr[] = { 30, 35, 45, 70, 8, 2 };
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				System.out.println(arr[i]);
			}

		}
	}

}
