package oop;

public class Test {
	public static void main(String[] args) {
		TestA t1=new TestA();
		TestA t2=new TestA(30);
		TestA t3=new TestA(30,40);
		t1.display();
		t2.display();
		t3.display();
	}

}
