package LambdaExpression;

@FunctionalInterface
public interface MathsOpp {

    public int  mathopp(int a,int b);

    default void m1(){
        System.out.println("this my defult method");
    }

    static  void  m2(){
        System.out.println("this my m2 method");
    }
}
