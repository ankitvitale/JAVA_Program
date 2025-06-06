package OOps;

public class Main {
    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.name="sheru";
       // d1.Barking();
        d1.age=25;

        d1.walk();

        Cat c= new Cat();
        c.color="red";
        c.walk();

    }
}

class Dog{
    //this is property

    String name;
    int age;
    String color;

    void walk(){

        System.out.println("Dog is walking");
        System.out.println("my dog name is "+name);
        System.out.println(age);
    }


    void Barking(){

        System.out.println("Dog is barking");
    }

}

class Cat{
    //this is property

    String name;
    int age;
    String color;

    void walk(){
        System.out.println("cat is walking");

        System.out.println("my cat color is "+color);
    }
}