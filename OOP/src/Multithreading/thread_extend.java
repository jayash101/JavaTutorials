package Multithreading;

public class thread_extend extends Thread{
    public void run(){
        for(int i = 1; i <= 10; i++){
            System.out.println(i);

            try{
                Thread.sleep(1000);
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        thread_extend t1 = new thread_extend();
        thread_extend t2 = new thread_extend();
        t1.start();
        t2.start();
    }
}
