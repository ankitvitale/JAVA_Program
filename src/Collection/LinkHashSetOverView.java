package Collection;

import java.util.LinkedHashSet;

public class LinkHashSetOverView {
    public static void main(String[] args) {

        LinkedHashSet<String> set=new LinkedHashSet<>();

        set.add("LIT");
        set.add("GWCET");
        set.add("PJLC");
        set.add("YCC");
        set.add("KDK");
//
//        System.out.println(set.size());
//
//        set.remove("YCC");
//        System.out.println(set);
//
//        set.addFirst("IIT");
//        System.out.println(set);
//
//        set.addLast("BD");
//        System.out.println(set);

        System.out.println(set.getLast());
        System.out.println(set.getFirst());

        System.out.println(set.spliterator());


    }

}
