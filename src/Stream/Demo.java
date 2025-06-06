package Stream;

import java.math.MathContext;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        Thread t1=new Thread(()->{
            System.out.println("i am ankit");
        });
         t1.run();


       MathOpration sum=( a, b)-> a+b;
       int res=sum.operate(52,8);
        System.out.println(res);

        //Predicate --> Functional Interface (Boolen value function)
        Predicate<Integer> isEven= x-> x % 2==0;
        System.out.println(isEven.test(25));
        Predicate<String > isWordStartWithA=x-> x.startsWith("A");
        System.out.println(isWordStartWithA.test("Ankit"));


        // Function

        Function<Integer,Integer> doubleIt= x->2*x;
        System.out.println(doubleIt.apply(20));
        Function<Integer,Integer> identity=Function.identity();
        Integer res2=identity.apply(5);
        System.out.println(res2);

        //Consumer

        Consumer<Integer> print=x-> System.out.println(x);
        print.accept(5);

        List<Integer> list= Arrays.asList(5,6,1);
        Consumer<List<Integer>> printList=x->{
            for (int i:x){
                System.out.println(i);
            }
        };
        printList.accept(list);

        //Supplier

        Supplier<String> givenHelloWord= ()-> "Hello word";
        System.out.println(givenHelloWord.get());



        //Combined Example

        int a[]={6,8,1,4,2,9,3};

        List<Integer> collect = Arrays.stream(a)
                .boxed()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("sorted Arrys are  "+collect);

        String str[]={"rahul","jay","ankit"};
        List<String> collect1 = Arrays.stream(str).sorted().collect(Collectors.toList());
        System.out.println(collect1);


    }
}

interface MathOpration{
  int operate(int a,int b);
}