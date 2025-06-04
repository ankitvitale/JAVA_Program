package Map;

import java.util.HashMap;
import java.util.Map;

public class CreateMap {
    public static void main(String[] args) {
        Map<String,Integer> student= new HashMap<>();
        student.put("rahul",101);
        student.put("kapil",102);
        student.put("sanket",103);
        student.put("sakshi",104);


        System.out.println(student.remove("kapil"));
        System.out.println(student);
        student.put("lokesh",105);
        System.out.println(student);
        System.out.println(student.size());

    }
}
