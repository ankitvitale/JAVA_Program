package Arryas;

public class ArrayDivisiable {
	public static void main(String[] args) {
		int arr[]= {30,35,45,70,8,2};
		System.out.println("Array is divisiable by 5 and  7");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%5==0 && arr[i]%7==0) {
				System.out.println(arr[i]);
			}
		}
	}

}
