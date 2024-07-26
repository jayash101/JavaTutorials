package Multithreading;

// creating class for synchronization
class multiplication_table{

    //synchronized method
     synchronized void display_multiples(int number){
        System.out.println("Table of " + number);

        for(int i = 1; i <= 10; i ++){
            System.out.println(number + " x " + i + " = " + number * i);

            try{
                Thread.sleep(1000);
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}

// Thread 1
class Thread1 extends Thread{
    multiplication_table m1;

    // constructor to pass value for thread 1
    public Thread1(multiplication_table m1){
        this.m1 = m1;
    }

    public void run(){
        m1.display_multiples(5);
    }
}

// Thread 2
class Thread2 extends Thread{
    multiplication_table m2;

    // constructor to pass value for thread 2
    public Thread2(multiplication_table m2){
        this.m2 = m2;
    }

    public void run(){
        m2.display_multiples(8);
    }
}

public class thread_synchronization {
    public static void main(String[] args) {
        // create multiplication_table object
        multiplication_table multiple = new multiplication_table();

        // creating threads
        Thread t1 = new Thread1(multiple);
        Thread t2 = new Thread2(multiple);

        // start threads
        t1.start();
        t2.start();
    }
}