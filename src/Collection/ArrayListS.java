package Collection;

import java.util.ArrayList;

public class ArrayListS {
    public static void main(String[] args) {

        ArrayList<String> name=new ArrayList<>();

        name.add("Nayan");
        name.add("dipali");
        name.add("Ankit");

        for(String obj:name){
            System.out.println(obj);

        }

        System.out.println("name of size is  "+name.size());



        System.out.println(name);




         name.remove("dipali");
        System.out.println(name);





        ArrayList<Integer> number=new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(3);

        System.out.println("one number contain---"+number.contains(5));
        int sum=0;
        for (Integer num:number){

            sum=sum+num;
        }
        System.out.println("Sum of all numbers:--"+sum);




        System.out.println(number);


        number.remove(2);
        System.out.println(number);

        ArrayList<Boolean> AB=new ArrayList<>();
        AB.add(true);
        AB.add(false);


        System.out.println(AB);

    }
}
