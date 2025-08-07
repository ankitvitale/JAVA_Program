package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
//
//        Set<Integer> num= new HashSet<>();
//
//        num.add(10);
//        num.add(60);
//        num.add(30);
//        num.add(10);
//
//        for (Integer o:num){
//            System.out.println(o);
//        }
//
//
//
//        System.out.println(num);


        Set<String> name=new HashSet<>();
        name.add("ankit");
        name.add("dipali");
        name.add("nayan");
        name.add("shantanu");

        Iterator it=name.iterator();


        while(it.hasNext())
        {
            System.out.println(it.next());
        }


//        for (String names:name){
//            System.out.println(names);
//        }

//        Iterator<String> iterator=name.iterator();
//
//
//        while (iterator.hasNext()){
//            String names=iterator.next();
//            System.out.println(names);
//
//        }

    }
}
