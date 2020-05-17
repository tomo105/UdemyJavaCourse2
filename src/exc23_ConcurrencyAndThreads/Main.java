package exc23_ConcurrencyAndThreads;

import static exc23_ConcurrencyAndThreads.ThreadColor.*;

public class Main {
    public static void main(String[] args) {

        System.out.println(ANSI_PURPLE + "Hello from +main+");
        Thread anotherThread = new AnotherThread();
        anotherThread.setName("++anotherThread++");
        anotherThread.start(); //enable jvm to start new thread

        new Thread(() ->
                System.out.println(ANSI_GREEN + "in the anonymous class")
        ).start();   //lambda expression

        Thread myRunnableThread = new Thread(new MyRunnable() {
            @Override
            public void run() {
                System.out.println(ANSI_RED + "hello from anonymous class impl");
                try {
                    anotherThread.join(3000);
                    System.out.println(ANSI_RED + " anotherThread terminated, or time out, so I'm running again  ");
                } catch (InterruptedException e) {
                    System.out.println(ANSI_RED + "Couldn't wait, I was interrupted");
                }
            }
        });

        myRunnableThread.start();
        // anotherThread.interrupt();

        System.out.println(ANSI_PURPLE + "main thread again");


        // anotherThread.start(); // error
        // you can not reuse the same instance of thread !!!!!!!!

        //Thread myRunnableThread = new Thread(new MyRunnable());
        //myRunnableThread.start();
        // or anonymous class
    }
}

