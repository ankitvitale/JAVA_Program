package Collection;

import java.util.Vector;

public class Vectors {
    public static void main(String[] args) {
        Vector<String> colour=new Vector<>(5);

        colour.add("Pink");
        colour.add("Red");
        colour.add("Black");
        colour.add("Green");
        colour.add("Purpal");


        colour.add("Pink");
        colour.add("Red");
        colour.add("Black");
        colour.add("Green");
        colour.add("Purpal");


        System.out.println(colour);

        colour.add("white");
        colour.capacity();
        System.out.println(colour.capacity());

        System.out.println("befour clear:-"+colour);

        colour.clear();;
        System.out.println("After clear "+colour);





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
