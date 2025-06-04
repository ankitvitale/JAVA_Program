package StatementConduction;

import java.util.Scanner;

public class Calculater {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number");
        int num1=sc.nextInt();
        System.out.println("Enter the second Number");
        int num2=sc.nextInt();

        System.out.println("Select the Symbol(+/*-)");
        String sym=sc.next();
        int res;

        switch (sym){
            case "+": res=num1+num2;
                System.out.println("Addtion"+res);
                break;
            case "-": res=num1-num2;
                System.out.println("Subtraction"+res);
                break;
            case "*": res=num1*num2;
                System.out.println("multiplation"+res);
                break;
            case "/":res=num1/num2;
                System.out.println("div"+res);
                break;
            default:
                System.out.println("invalid sysmbole");
                break;
        }


    }
}
