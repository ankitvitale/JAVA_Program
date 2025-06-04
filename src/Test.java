public class Test {
     int c=30;

    void m1(){
        int a=10;

        System.out.println(a+c);
    }
    void m2(){
        int b=20;

        System.out.println("m2 method output"+b+c);
    }

    public static void main(String[] args) {
        Test obj=new Test();
        obj.m1();
        obj.m2();


    }
}
