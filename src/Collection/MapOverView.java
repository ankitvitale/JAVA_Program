package Collection;

import com.sun.jdi.Value;

import java.util.*;

public class MapOverView {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            HashMap<String, Integer> map = new HashMap<>();
            map.put("dipali", 1);
            map.put("nayan", 2);
            map.put("sahil", 3);
            map.put("mehul", 4);
            map.put("soban", 5);
            map.put("ajay", 6);
           Map<String, Integer> sortedMap = new TreeMap<>(map);
           System.out.println(sortedMap);

//        for (Map.Entry<String,Integer> entrys: map.entrySet()){
//            System.out.println(entrys.getKey()+":"+entrys.getValue());
//        }

        map.forEach((key,Value)-> System.out.println(key+"::"+Value));



            //map.forEach((key, Value)-> System.out.println(key+":"+Value));

//             for (Map.Entry<String,Integer> entry: map.entrySet()){
//                 System.out.println(entry.getKey()+" : "+entry.getValue());
//             }




//
//        System.out.println("befour replace"+map);
//
//
//        map.replace("sahil",4);
//
//        System.out.println( "After repalce" +map);
//
//
//
//        System.out.println(" this value exit or not-" +map.containsKey("ajay"));
//        System.out.println(" this value exit or not-" +map.containsKey("sumit"));
//
//
//
//        System.out.println(" remove name"+ map.remove("ajay"));
//        System.out.println(map);


//            System.out.println("Enter the name:-");
//            String key=sc.next();

//            if(map.containsKey(key)){
//
//                int value=map.get(key);
//                System.out.println("Roll of " + key + "  is  " + value);
//
//            }else {
//                System.out.println("Student is not found");
//            }



        }


//        String s = map.get(2);
//        System.out.println("2 no data show:--"+s);
//        System.out.println(map);

    }

//    }
















//}
//        HashMap<Integer,String> name=new HashMap<>();
//
//        name.put(1,"ankit");
//        name.put(2,"sahil");
//        name.put(3,"kapil");
//        name.put(4,"bhushan");
//        name.put(5,"ravi");
//        name.put(6,"ram");
//        String s = name.get(2);
//        System.out.println(s);
//
//        Set<Map.Entry<Integer, String>> entries = name.entrySet();
//        for (Map.Entry<Integer, String> names :entries){
//        System.out.println(names.getKey()+":"+names.getValue());
