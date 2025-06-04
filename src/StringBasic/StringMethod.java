package StringBasic;

import java.util.Scanner;

public class StringMethod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("Enter the first Name");
            String firstname = sc.nextLine();

            System.out.println("Enter the Last Name");
            String lastName = sc.nextLine();

            System.out.println("My Fist Name is " + firstname + " & Last name is " + lastName);
        }
    }
}
