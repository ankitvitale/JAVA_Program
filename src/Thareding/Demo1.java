package Thareding;

public class Demo1 extends Thread{

    public Demo1(String name){
        super(name);
    }
    public void run(){
        for (int i=0;i<5;i++){
            System.out.println(getName()+" with priorty"+ getPriority()+" -count"+i);
        }

    }

    public static void main(String[] args) throws InterruptedException {
        Demo1 demo1=new Demo1("Lowest Priorty thred");
        Demo1 demo2=new Demo1("Normal Priorty thred");
        Demo1 demo3=new Demo1("Higest Priorty thred");

        demo1.setPriority(Thread.MIN_PRIORITY);
        demo2.setPriority(Thread.NORM_PRIORITY);
        demo3.setPriority(Thread.MAX_PRIORITY);

        demo1.start();
        demo2.start();
        demo3.start();
        demo1.join();
        demo2.join();
        demo3.join();
    }

}
