package OOps.Static;

public class Test {

//    static {
//        System.out.println(" Static block");
//    }

//    {
//        System.out.println(" instance block");
//    }



    public static void main(String[] args) {


        System.out.println(A.a);

//    // Static method
        int result = MathUtils.square(5);  // Call static method directly with class name
        System.out.println("Square of 5 is: " + result);

        int sum=MathUtils.add(10,52);
        System.out.println(sum);


//
//        //statice veriable
//
        Student s1 = new Student(101, "Dipali");
        Student s2 = new Student(102, "Nayan");
//
        s1.display();
        s2.display();
//
//

//
//
      //  System.out.println(A.a); // Triggers static block
    }


}
