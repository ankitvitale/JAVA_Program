package Thareding;

public class main  extends  Thread {
    private String threadName;

    public main(String name) {
        this.threadName=name;
    }



    public void run(){
        System.out.println("Running Thread "+threadName);
        System.out.println("Current thred Name "+Thread.currentThread().getName());

        if (threadName.equals("Thread-3") || threadName.equals("Thread-4")) {
            try {
                System.out.println(threadName + " is going to sleep for 5 seconds...");
                Thread.sleep(5000); // Sleep for 5 seconds
                System.out.println(threadName + " woke up!");
            } catch (InterruptedException e) {
                System.out.println(threadName + " was interrupted.");
            }
        }
    }

    public static void main(String[] args) {
        main M=new main("Thread 0");
        main M1=new main("Thread 1");
        main M2=new main("Thread 2");
        main M3=new main("Thread 3");
        main M4=new main("Thread 4");
        main M5=new main("Thread 5");

        M.start();
        M1.start();
        M2.start();
        M3.start();
        M4.start();
        M5.start();
        System.out.println("Main method thread: " + Thread.currentThread().getName());


    }
}
