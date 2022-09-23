package Arryas;

import java.util.Scanner;

public class Excersic3 {
	public static void main(String[] args) {

		
		
		

		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int flag = 0;
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j] && i != j) {
					flag = 1;
					break;
				} else {
					flag = 0;
				}
			}
			if (flag == 0) {
				System.out.println("-------");
				System.out.println(arr[i]);
			}
		}
	}
}