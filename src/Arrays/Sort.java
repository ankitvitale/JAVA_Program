package Arrays;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] a = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456
        };
        Arrays.stream(a).sorted();
        System.out.println();
    }
}
