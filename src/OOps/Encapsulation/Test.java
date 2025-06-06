package OOps.Encapsulation;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        BankAccount bankAccount= new BankAccount();

        while (true){
            System.out.println("--------Welcome To HDFC Bank------------");
            bankAccount.setAccountNumber(125638);
            System.out.println("Ac No-"+bankAccount.getAccountNumber());

            System.out.println("Deposite the amount");
            Double depositAmount=scanner.nextDouble();
            bankAccount.deposit(depositAmount);

            System.out.println("Withdraw the amount");
            Double witjdrawAmount=scanner.nextDouble();
            bankAccount.withdraw(witjdrawAmount);


            System.out.println("-----------Current Bank Balance----------");
            System.out.println("Balance  "+bankAccount.getBalance());
        }







//        BankAccount bankAccount= new BankAccount();
//        bankAccount.withdraw(200);
//        System.out.println(bankAccount.getBalance());
//        System.out.println("----------------------");
//
//        bankAccount.deposit(5000);
//        System.out.println("Current Balanve is  "+bankAccount.getBalance());
//        System.out.println("----------------------------");
//
//        bankAccount.withdraw(2000);
//
//        System.out.println(bankAccount.getBalance());



    }
}
//        Scanner scanner=new Scanner(System.in);

//        Student student=new Student();
//        student.name="ram";
////        student.age(10);
//        student.rollNumber=101;
//        System.out.println(student.name);
//        System.out.println(student.age);

//
//        BankAccount bankAccount=new BankAccount();
//        bankAccount.withdraw(20);
//        bankAccount.deposit(500);
//        bankAccount.withdraw(200);
//
//        System.out.println("Current Balance is  "+bankAccount.getBalance());

//        BankAccount bankAccount=new BankAccount();
//
//        System.out.println("Plz Deposite the Cash");
//        Double depositeamount=scanner.nextDouble();
//        bankAccount.deposit(depositeamount);
//
//        System.out.println("Enter the withdraw amount");
//        Double withdrawamount=scanner.nextDouble();
//        bankAccount.withdraw(withdrawamount);
//
//        System.out.println("Your current balance is "+bankAccount.getBalance());