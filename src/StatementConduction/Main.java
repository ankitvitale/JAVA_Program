package StatementConduction;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your full name using next(): ");
        String nameWithNext = sc.next();  // Reads only the first word

//        sc.nextLine(); // Consume the leftover newline

        System.out.print("Enter your full name using nextLine(): ");
        String nameWithNextLine = sc.nextLine();  // Reads the full line

        System.out.println("Using next(): " + nameWithNext);
        System.out.println("Using nextLine(): " + nameWithNextLine);

        sc.close();
    }
}
