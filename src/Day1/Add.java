package Day1;

public class Add {


    void sum(){
        int a=10;
        int b=20;
        int c;
        c=a+b;
        System.out.println(c);
    }
    public static void main(String[] args) {
//        int a=10,b=20,c;
//        c=a+b;
//        System.out.println(c);

        Add a=new Add();
        a.sum();
    }
}
