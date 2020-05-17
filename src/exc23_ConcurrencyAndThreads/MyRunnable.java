package exc23_ConcurrencyAndThreads;

import static exc23_ConcurrencyAndThreads.ThreadColor.ANSI_RED;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(ANSI_RED + "my runnable is calling");
    }
}
