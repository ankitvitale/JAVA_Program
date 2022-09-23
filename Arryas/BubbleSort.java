package Arryas;

public class BubbleSort {
	public static void main(String[] args) {
		int a[] = { 6, 2, 4, 9, 1, 3 };

		for (int i = 0; i < a.length; i++) {
			int temp = 0;
			for (int j = i + 1; j < a.length-1; j++) {
				if (a[i] < a[j + 1]) {
					temp = a[i];
					a[i] = a[j + 1];
					a[j + 1] = temp;

				}
			}

		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(" "+a[i]);
		}  
		
		
	}

}
