package OOps.Inheritance;

public class Animals {
    private String name;
    private  int age;

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





    public void sayHello(){
        System.out.println("---- ");
    }

    public void  run(){
        System.out.println("Run Fast");
    }

    public void eat(){
        System.out.println("This animals eat");
    }

}
