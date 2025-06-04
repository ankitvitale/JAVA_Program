package Arrays;

public class MissingElement {
    public static void main(String[] args) {
//        int a[]={1,2,4,6};
//        int expect_noOfArray=a.length+1;
//        int totalSum=expect_noOfArray*(expect_noOfArray+1)/2;
//        int sum=0;
//        for(int i=0;i<a.length;i++){
//            sum=sum+a[i];
//        }


//        System.out.println(totalSum-sum);

//        int[] a = {1, 2, 4, 6};
//        int n = 6; // Expected highest number in the sequence
//
//        int expectedSum = n * (n + 1) / 2;
//        int actualSum = 0;
//        for (int value : a) {
//            actualSum += value;
//        }
//
//        int missingNumber = expectedSum - actualSum;
//        System.out.println("Missing number is: " + missingNumber);

        int []a={1,8,5,3,7};

     //   int []a ={1,9,3,8,2,5};

        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }

        // Create a register of size max + 1
        int[] register = new int[max + 1];

        // Mark the present numbers
        for (int i = 0; i < a.length; i++) {
            register[a[i]] = 1;
        }

        // Find and print missing numbers
        System.out.println("Missing numbers in given array:");
        for (int i = 1; i <= max; i++) {
            if (register[i] == 0) {
                System.out.println(i);
            }
        }

    }
}
