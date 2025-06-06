package OOps.Encapsulation;

public class BankAccount {

    private long accountNumber;
    private double balance;



    public void deposit(double amount){
        if(amount >0){
            balance+=amount;
            System.out.println("amount is deposit   "+amount);
        }else {
            System.out.println("Error amount");
        }

    }



    public void withdraw(double amount){
       if (amount >0 && amount<=balance){
           balance-=amount;
           System.out.println("withdraw amount is "+amount);
       }else {
           System.out.println(" Blance is Low");
       }
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }


}
