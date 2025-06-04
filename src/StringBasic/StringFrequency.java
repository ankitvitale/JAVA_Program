package StringBasic;

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
    }

}
