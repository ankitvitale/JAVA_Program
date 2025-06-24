package Homework;

public class Emp1 {
	int empcode;
	String name;
	String desg;
	double sal;

	public Emp1(int empcode, String name, String desg, double sal) {
		super();
		this.empcode = empcode;
		this.name = name;
		this.desg = desg;
		this.sal = sal;
	}

	public Emp1() {
	}

	@Override
	public String toString() {
		return "Emp1 [empcode=" + empcode + ", name=" + name + ", desg=" + desg + ", sal=" + sal + "]";
	}

	void getupdate(String desg) {
		if(desg.equals("Tester"))
			sal = sal+(sal*0.10f);
		
		if(desg.equals("Dev"))
			sal = sal+(sal*0.20f);
	}

}
