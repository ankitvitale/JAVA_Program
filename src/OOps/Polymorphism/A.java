package OOps.Polymorphism;

public class A {

   public int add(){
        int a = 10,b=20,c;
        c=a+b;
        return c;
    }



    public int add(int a, int b) {
        return a + b;
    }

    public double add( double a,double b){
        return a+b;
    }


    public void eat(){
        System.out.println("eat slow");
    }
}
