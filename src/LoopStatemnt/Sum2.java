package LoopStatemnt;

public class Sum2 {
    public static void main(String[] args) {
        int i=1;
        int f=1;

        do{
            System.out.println(i);
            f=f*i;
            i++;
            System.out.println("i2"+i);
        }
        while(i<=5);

        System.out.println("factorial of 5 :--"+f);

    }
}
