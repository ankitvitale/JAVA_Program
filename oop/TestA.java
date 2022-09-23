package oop;

public class TestA {
	int value1;
	int value2;
	
	
	TestA(){
		value1=10;
		value2=20;
		System.out.println("inside the firest constructor");
		
	}
	
	TestA(int a){
		value1=a;
		System.out.println("inside 2nd contructor");
		
	}
	


	public TestA(int a, int b) {
		
		value1 = a;
		value2 = b;
		System.out.println("inside 3nd conyroctor");
	}
	
	public void  display() {
		System.out.println("value==="+value1);
		System.out.println("value==="+value2);
		
	}
	

}
