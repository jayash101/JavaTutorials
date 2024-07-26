package Multithreading;

public class thread_implement implements Runnable{
    public void run(){
        for (int i = 1; i <= 10; i++) {
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
        thread_implement t = new thread_implement();
        Thread th = new Thread(t);
        th.start();
    }
}
