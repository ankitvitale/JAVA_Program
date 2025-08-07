package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class SetOverView {

    public static void main(String[] args) {


        HashSet<String> h_set = new HashSet<String>();
        // use add() method to add values in the hash set
        h_set.add("Red");
        h_set.add("Green");
        h_set.add("Black");
        h_set.add("White");
        h_set.add("Pink");
        h_set.add("Yellow");
        h_set.add("");
        System.out.println("Original Hash Set: " + h_set);
        HashSet <String> new_h_set = new HashSet <String> ();
        new_h_set = (HashSet)h_set.clone();
        System.out.println("Cloned Hash Set: " + new_h_set);




//        HashSet<Integer> set= new HashSet<>();
//
//        set.add(10);
//        set.add(20);
//        set.add(10);
//        set.add(30);
//        set.add(40);
//        System.out.println(set);
//
//        set.remove(10);
//        System.out.println(set);
//
//        if(set.contains(20)){
//            System.out.println("20is present");
//        }

//        Iterator it=set.iterator();
//
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }



    }
}
