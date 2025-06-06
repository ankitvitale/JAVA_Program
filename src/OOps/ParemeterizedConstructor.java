package OOps;

public class ParemeterizedConstructor {

//    public ParemeterizedConstructor(int no){
//        System.out.println("No  ."+no);
//    }



    public  ParemeterizedConstructor(String name,int age){
        System.out.println("may name is "+name+" and my age is "+age);
    }
    public static void main(String[] args) {
        ParemeterizedConstructor obj=new ParemeterizedConstructor("sahil",21);

    }
}
