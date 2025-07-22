package Thareding;

class Worker extends Thread {
    public Worker(String name) {
        super(name);
    }

    public void run() {
        System.out.println(getName() + " is working...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}
        System.out.println(getName() + " finished.");
    }

    public static void main(String[] args) throws InterruptedException {
        Worker t1 = new Worker("Thread-1");
        Worker t2 = new Worker("Thread-2");

        t1.start();
        t1.join();  // Main thread waits for t1

        t2.start();
        t2.join();  // Main thread waits for t2

        System.out.println("All threads finished. Main thread ends.");
    }
}
