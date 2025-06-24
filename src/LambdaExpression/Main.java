package LambdaExpression;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        Test test=new Test();
        //test.sayHello();


        Runnable ankit=()-> System.out.println("my name is Khan");
        ankit.run();

        I1 i=()-> System.out.println("abc");
        i.eat();











//
//        Runnable hii= ()-> System.out.println("i am ankit");
//        hii.run();
//
//        MathsOpp add=(a,b)-> a-b;
//        System.out.println("sum of two veriable is "+add.mathopp(5,98));
//
//         Sqet sqet=(s -> s*s);
//        System.out.println("");

    }
}
