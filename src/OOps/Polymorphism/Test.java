package OOps.Polymorphism;

public class Test {

    public static void main(String[] args) {

        B b=new B();
        b.add();

        System.out.println(b.add());
        System.out.println( b.add(10,85));
        b.eat();

        A a=new B();
        a.eat();
    }
}
