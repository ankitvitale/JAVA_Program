package Basic;

public class SumOfDight {
    public static void main(String[] args) {
        int no=125;
        int sum=0;
        while (no>0){
            int rem=no%10;
            no=no/10;
            sum=sum+rem;
        }
        System.out.println(sum);
    }
}
