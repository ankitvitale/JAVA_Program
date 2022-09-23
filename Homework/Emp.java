package Homework;

public class Emp {

	int id;
	String name;
	String course;
	double per;

	public Emp(int id, String name, String course, double per) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.per = per;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", course=" + course + ", per=" + per + "]";
	}

}
