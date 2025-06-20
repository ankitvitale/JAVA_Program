package Interface.Multilevel;

public interface I1 {


    int a=10;
    void show();

    default void run(){
        System.out.println("i am ankit");
    }

   static void eat(){
        System.out.println("i am eat the food");
    }

}
