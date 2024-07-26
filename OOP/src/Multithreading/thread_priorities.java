package Multithreading;

// Thread one
class first_thread extends Thread{
    public void run(){
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}

// Thread two
class second_thread extends Thread{
    public void run(){
        for (int i = 11; i <= 20; i++) {
            System.out.println(i);
        }
    }
}

// Thread three
class third_thread extends Thread{
    public void run(){
        for (int i = 21; i <= 30; i++) {
            System.out.println(i);
        }
    }
}

public class thread_priorities {
    public static void main(String[] args) {
        // creating thread objects
        Thread t1 = new first_thread();
        Thread t2 = new second_thread();
        Thread t3 = new third_thread();

        // setting thread priorities
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);

        // starting threads
        t1.start();
        t2.start();
        t3.start();
    }
}
