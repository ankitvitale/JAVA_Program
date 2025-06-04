package StringBasic;

import java.util.Locale;

public class StringDay2 {
    public static void main(String[] args) {


//        //UpperCase
//
       String str="   ankHJo  ";
//        System.out.println(str.toUpperCase());
//
//
         //lowerCase
//
//        String str1="KaPiL";
//        System.out.println(str1.toLowerCase());

//
        //trim
//        System.out.println(str);
//        System.out.println(str.trim());

        //startwith
        //System.out.println("Carpet".startsWith("Car")); // true

//        System.out.println("cartpet".startsWith("cartoon"));
//        System.out.println("cartpet".startsWith("cartoon"))
//
        //charAt
//        String name =" Rahul";
//        System.out.println(name.charAt(2));
//
        //valueOf
//
//        int age=123;
//        String StringAge=String.valueOf(age);
//        System.out.println(age+2);
//        System.out.println(StringAge+6);

        //replace

//        String  sentence="i love movie & movie is good";
//
//
//        String newSenetence=sentence.replace("movie","Ramayan");
//        System.out.println(sentence);
//        System.out.println(newSenetence);

        //subString
    //    String  str3="i love movie & movie is good";
//        String Substring=str3.substring(2,5);
//        System.out.println(Substring);

        //split
        String  str4="i love movie & movie is good";
        String word[]=str4.split(" ");
        for (String w:word){
            System.out.println(w);
        }


    }
}
