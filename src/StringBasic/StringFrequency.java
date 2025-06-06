package StringBasic;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class StringFrequency {
    public static void main(String[] args) {
        String str= "aabbbbcc";

Map<Character,Long> map=str.chars().mapToObj(c-> (char) c)
                .collect(Collectors.groupingBy(
                        character -> character,
                        Collectors.counting()
                ));
        System.out.println(map);

        int arr[]={2,5,1,2,6,2,1};

        Map<Integer,Long> map1= Arrays.stream(arr).mapToObj(a-> (int) a)
                .collect(Collectors.groupingBy(
                        Integer-> Integer,
                        Collectors.counting()
                ));
        System.out.println(map1);


    }

}
