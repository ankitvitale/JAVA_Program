package Arryas;

public class DuplicateElement {
	public static void main(String[] args) {
		
		int arr[]= {6,7,5,4,6,1,5};
		
		System.out.println("The given Arrays:-");
		for(int i=0;i<arr.length;i++) {
			System.out.println(""+arr[i]);
		}
		
		System.out.println("DuplicateElement:=");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}
	}

}
 