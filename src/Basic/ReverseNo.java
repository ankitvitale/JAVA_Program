package Basic;

public class ReverseNo {
    public static void main(String[] args) {
        int no=1241;
        System.out.println(no);
        int rem,rev=0;

        int temp=no;
        while (temp!=0){
            rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        System.out.println(temp);
        System.out.println("rev"+rev);
        System.out.println("no"+no);
        if(no==rev){

            System.out.println("palindrome no");
        }else {
            System.out.println("not palindrome  no");
        }



    }
}
