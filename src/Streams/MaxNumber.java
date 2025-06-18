package Streams;

import java.util.Arrays;
import java.util.List;

public class MaxNumber {
    public static void main(String[] args) {

        int num[]={54,85,69,41,2,9,69};

        Integer max=Arrays.stream(num).max().orElseThrow();
        System.out.println(max);

    }
}
