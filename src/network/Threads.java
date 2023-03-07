package network;

public class Threads {
    public static void main(String[] args) throws InterruptedException {

//        System.out.println( Thread.activeCount());
//        System.out.println(Thread.currentThread().getName());
//        Thread.currentThread().setName("Ahmad");
//        Thread.currentThread().setPriority(10);
//        System.out.println(Thread.currentThread().getPriority());

       // System.out.println(  Thread.currentThread().isAlive());

//        for (int i=3; i>0; i--){
//            System.out.println(i);
//            Thread.sleep(2000);
//        }
//        System.out.println("You are done");

            MyThread thread2 = new MyThread();
//            thread2.start();
       // System.out.println(thread2.isAlive());
        //thread2.setName("2nd thread");
      //  System.out.println(thread2.getName());
        System.out.println(Thread.activeCount());

    }
}
