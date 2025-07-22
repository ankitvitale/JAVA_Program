package Thareding;

public class Test extends Thread{

    public void run(){
        System.out.println(" my thread Start   "+Thread.currentThread().getName());

        try {
            Thread.sleep(9000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println(" my thread End     "+Thread.currentThread().getName());
    }



    public static void main(String[] args) {
        Test test=new Test();
        test.run();

    }
}
