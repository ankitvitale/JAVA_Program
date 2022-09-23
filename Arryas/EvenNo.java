package Arryas;

public class EvenNo {
	public static void main(String[] args) {
		int a[]= {14,6,2,9,7,1};
		int sum=0;
		for(int i=0;i<=a.length-1;i++){
			if(a[i]%2==0) {
				System.out.println("Even no is:"+a[i]);
				sum=sum+a[i];
			}
		}
		System.out.println("------------------");
		System.out.println("Even no is:-"+sum);
	}

}
