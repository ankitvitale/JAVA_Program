package Thareding;

public class Demo extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Child Thread: " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Demo t = new Demo();
        t.start(); // Starts new thread
        t.join();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread: " + i);
        }
    }
}
