package SuperKeyword;

public class B extends A{
    int a=20;

    B(){
        super();

        //  System.out.println("B constructor");
    }
    void show(){
        System.out.println(super.a);

        System.out.println(a);
        //System.out.println(super.a);
    }

    void run(){

        super.run();
        System.out.println("Dog run fast");

    }
}
