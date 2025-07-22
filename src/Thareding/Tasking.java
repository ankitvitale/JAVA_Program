package Thareding;

public class Tasking implements Runnable {

    @Override
    public void run() {
        System.out.println("my thered class");

    }

    public static void main(String[] args) {

        Thread t=new Thread(new Tasking());
        t.run();

    }

}
