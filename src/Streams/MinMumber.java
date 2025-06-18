package Streams;

import java.util.Arrays;

public class MinMumber {
    public static void main(String[] args) {
        int num[]={87,2,45,-4,65,-1,1,98,65};
        Integer min= Arrays.stream(num).min().orElseThrow();
        System.out.println(min);
    }
}
