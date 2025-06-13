package OOps.Inheritance;

public class Grandparant {
    private  String name;
    private int age;

    Grandparant(){
        System.out.println("Grandparant Constructor");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat(){
        System.out.println("Bhakari ");
    }
}
