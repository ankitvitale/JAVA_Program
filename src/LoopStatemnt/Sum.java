package LoopStatemnt;

public class Sum {
    public static void main(String[] args) {
        int i=0;
        int sum=0;
        while(i<10){
            System.out.println("value of I=="+ i);

            sum=sum+i;
            i++;
        }

        System.out.println("sum"+ sum);
    }
}
