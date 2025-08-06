package Collection;


import java.util.TreeMap;

public class TreeMapOverviews {
    public static void main(String[] args) {


        TreeMap<Integer,String> map=new TreeMap<>();

        map.put(101,"nagpur");
        map.put(102,"yavatmal");
        map.put(103,"wardha");
        map.put(104,"jam");

        System.out.println(map);

        System.out.println(   map.size());

        for (Integer key:map.keySet()){
            System.out.println(key+" : "+map.get(key));
        }

        map.remove(102);
        System.out.println(map);

        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
        System.out.println(map.containsKey(103));
        System.out.println(map.containsValue("jam"));






    }
}
