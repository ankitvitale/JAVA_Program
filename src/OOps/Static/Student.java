package OOps.Static;

public class Student {
    int id;
    String name;

    // Static variable: shared by all Student objects
    static String college = "Wanjari College";

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name + " " + college);
    }
}
