package Collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkHashMapOverview {
    public static void main(String[] args) {
        Map<Integer,String> map= new LinkedHashMap<>();

        map.put(1,"ankit");
        map.put(2,"sahil");
        map.put(3,"dipali");
        map.put(4,"nayan");

        System.out.println(map);

//        System.out.println(map.containsKey(1));
        if(map.containsKey(1)){
            System.out.println("1 is present");
        }
        System.out.println(map.size());


        for (Map.Entry<Integer,String> entry:map.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

    }


}
