package exc23_ConcurrencyAndThreads;

import static exc23_ConcurrencyAndThreads.ThreadColor.ANSI_BLUE;

public class AnotherThread extends Thread {

    @Override
    public void run() {
        System.out.println(ANSI_BLUE + "Hello from " + currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(ANSI_BLUE + "Another thread wakes up");
            return;
        }
        System.out.println(ANSI_BLUE + "3s has passed and I am awake");
    }
}
