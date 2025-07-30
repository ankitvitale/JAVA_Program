package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Vectors {
    public static void main(String[] args) {

//        List<Integer> list=new ArrayList<>();

        Vector<Integer> list=new Vector<>();

        Thread t1=new Thread(()->{
            for (int i=0;i<1000;i++){
                list.add(i);
            }
        });

        Thread t2=new Thread(()->{
            for (int i=0;i<1000;i++){
                list.add(i);
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();

        }catch (InterruptedException e){
            System.out.println(e);
        }


        System.out.println("List of size is--"+list.size());


        //    Vector<String> colour=new Vector<>(5);

//        colour.add("Pink");
//        colour.add("Red");
//        colour.add("Black");
//        colour.add("Green");
//        colour.add("Purpal");
//
//
//        colour.add("Pink");
//        colour.add("Red");
//        colour.add("Black");
//        colour.add("Green");
//        colour.add("Purpal");
//
//
//        System.out.println(colour);
//
//        colour.add("white");
//        colour.capacity();
//        System.out.println(colour.capacity());
//
//        System.out.println("befour clear:-"+colour);
//
//        colour.clear();;
//        System.out.println("After clear "+colour);





//        System.out.println(colour);
//        colour.add(0,"white");
//
//        colour.set(1,"blue");
//
//        System.out.println(colour);
//
//
//        System.out.println(" 2 nd indext posstion "+colour.get(2));
//
//
//        Vector<Integer> num=new Vector<>();
//        num.add(5);
//        num.add(4);
//        num.add(6);
//        num.add(12);
//        num.add(3);
//        System.out.println("All number"+ num);
//
//        for (Integer ab:num){
//            System.out.println(ab);
//        }
//
//        num.remove(4);
//        System.out.println(num);
    }
}
