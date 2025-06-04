package Basic;

public class primenoPrint1to100 {
    public static void main(String[] args) {
        int count = 0;
        for (int no = 1; no < 100; no++) {

            for (int i = 2; i < no; i++) {
                if (no % i == 0) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("prime no is"+no);
            }
        }
    }
}
