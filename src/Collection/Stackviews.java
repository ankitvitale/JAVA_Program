package Collection;

import java.util.Stack;

public class Stackviews {

    public static void main(String[] args) {

        Stack<Integer> num=new Stack<>();
        num.push(10);
        num.push(20);
        num.push(30);
        num.push(40);
        num.push(50);
        num.push(60);
        num.push(70);
        num.push(80);
        num.push(90);
        num.push(100);

        System.out.println(num);
        System.out.println("peek elemet is-"+num.peek());

        Integer removeElement=num.pop();
        System.out.println("remove element-"+removeElement);
        System.out.println(num);

        System.out.println("Search element is --:"+num.search(50));
        System.out.println("Search element is --:"+num.search(40));
        System.out.println("Search element is --:"+num.search(30));
        System.out.println("Search element is --:"+num.search(20));
        System.out.println("Search element is --:"+num.search(10));


        System.out.println( "Capacity is="+ num.capacity());

        num.addFirst(5);
        System.out.println(num);
        num.addLast(2);
        System.out.println(num);



    }
}
