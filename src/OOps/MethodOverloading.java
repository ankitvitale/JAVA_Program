package OOps;

public class MethodOverloading {

    public int add(int a,int b){
        return a+b;
    }

    public String add(String name){
        return name;
    }



    public static void main(String[] args) {
        MethodOverloading m=new MethodOverloading();
//m.add(10,20);
        System.out.println(m.add(10,20));
    }
}
