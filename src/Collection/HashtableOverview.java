package Collection;

import java.util.Hashtable;

public class HashtableOverview {
    public static void main(String[] args) {

        Hashtable<Integer,String> table = new Hashtable<>();

          table.put(100,"kapil");
          table.put(200,"sayali");
          table.put(300,"rahul");
          table.put(400,"karan");

        System.out.println(table);

//        for (Integer Key:table.keySet()){
//            System.out.println(Key+" "+table.get(Key));
//        }

        for(Integer value:table.keySet()){
            System.out.println(value+" "+table.get(value));
        }
        System.out.println(table.size());
       // table.keySet()

        table.remove(400);
        System.out.println(table);



        System.out.println(table.containsKey(200));
        System.out.println(table.contains("rahul"));

        table.replace(100,"sumit");
        System.out.println(table);

    }
}
