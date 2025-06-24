package Homework.Patten;

public class patten6 {
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==4|| i==2|| i==3) {
					System.out.print(" * ");
				}else {
					System.out.print(" @ ");
				}
			}
			System.out.println(" ");
		}
		
		
		
		
		
		
		System.out.println("------------------------------------");
		
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==1|| i==2|| j==4 || j==5) {
					System.out.print(" * ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println(" ");
		}
		
		
		
		System.out.println("------------------------------------");
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==1|| i==2|| j==4 || j==5) {
					System.out.print(" @ ");
				}else {
					System.out.print(" * ");
				}
			}
			System.out.println(" ");
		}
		
	}


}
