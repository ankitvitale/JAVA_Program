package LambdaExpression;

public class Ankit {
    public static void main(String[] args) {

        Cal c=(a,b)-> a+b;

        Cal d=(a,b)-> a-b;

        System.out.println(" sum "+c.add(10,58));

        System.out.println("sub  "+d.add(10,5));


    }
}

