package OOps.Inheritance;

public class Child extends Parant{

    private String school;

    Child(){
        System.out.println("Child Constructor");
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void eat(){
        System.out.println("Pizza ");
    }
}
