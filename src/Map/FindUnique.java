package Map;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 3, 2}; // our list of numbers

        int unique = 0; // start with 0 (like empty hands)

        for (int i = 0; i < arr.length; i++) {
            unique = unique ^ arr[i]; // press XOR magic button
        }

        System.out.println("Unique number is: " + unique); // show the winner
    }
}
