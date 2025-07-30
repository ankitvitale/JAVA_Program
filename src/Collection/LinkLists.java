package Collection;

import com.sun.jdi.connect.spi.Connection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Vector;

public class LinkLists {
    public static void main(String[] args) {

//        LinkedList<String> city=new LinkedList<>();
//        city.add("Nagpur");
//        city.add("wardha");
//        city.add("pune");
//        city.add("Lonawala");
//
//        System.out.println(city);
//
//        for (String citys:city){
//            System.out.println(citys);
//        }
//
//
//        System.out.println(city.size());
//
//        System.out.println("My first city name is:-"+city.getFirst());
//
//        System.out.println("My List city is:-"+city.getLast());
//
//
//        LinkedList<Integer> num=new LinkedList<>();
//        num.add(20);
//        num.add(10);
//        num.add(30);
//        num.add(5);
//        num.add(15);
//        int sum=0;
//        for (Integer no:num){
//            sum=sum+no;
//        }
//
//        System.out.println("Total sum of all NUmber:-"+sum);
//        int mid= sum /2;
//
//
//        System.out.println("Midle value:-"+mid);





//
//        int midElement=num.size()/2;
//        System.out.println("midel Element in linkList"+num.get(midElement));
//
//
//
//        System.out.println("Befour Sorting:--"+num);
//
//        Collections.sort(num);
//
//        System.out.println("After Sorting:--"+num);
//
//
//        for (Integer in:num){
//            System.out.println(in);
//        }
//
//        num.remove(4);
//        System.out.println("After removing number:-"+num);


//        ArrayList<Integer> list=new ArrayList<>();
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

        System.out.println("size of list::---"+list.size());

    }
}
