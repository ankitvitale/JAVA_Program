package Thareding;

class MyThread extends Thread {
    private String name;

    MyThread(String name) {
        this.name = name;
    }

//    public void run() {
//        for (int i = 1; i <= 8; i++) {
//            System.out.println(name + " - Count: " + i);
//        }
//    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(name + " - Count: " + i);
            try {
                Thread.sleep(10000); // Sleep for 1 second (1000 ms)
            } catch (InterruptedException e) {
                System.out.println(name + " was interrupted.");
            }
        }
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread A");
        MyThread t2 = new MyThread("Thread B");

        t1.start(); // Runs in parallel
        t2.start(); // Runs in parallel
    }
}
