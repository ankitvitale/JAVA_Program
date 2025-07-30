package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapCode2 {
    public static void main(String[] args) {
  while (true) {
    Scanner sc = new Scanner(System.in);
    Map<String, Integer> student = new HashMap<>();
    student.put("kapil", 101);
    student.put("jay", 102);
    student.put("rani", 103);
    student.put("ravi", 104);
    System.out.println("Enter the name");
    String key = sc.next();

    if (student.containsKey(key)) {
        int value = student.get(key);
        System.out.println("Roll of " + key + "  is  " + value);
    } else {
        System.out.println(key + "not Found in map");
    }

}
    }
}
