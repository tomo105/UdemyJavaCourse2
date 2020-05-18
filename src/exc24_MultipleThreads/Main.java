package exc24_MultipleThreads;

public class Main {
    public static void main(String[] args) {
        Countdown countdown = new Countdown();
        CountdownThread ct1 = new CountdownThread(countdown);
        ct1.setName("Thread 1");
        CountdownThread ct2 = new CountdownThread(countdown);
        ct2.setName("Thread 2");
        //race conditions !!!!!!!!!!!!!!!!
        ct1.start();
        ct2.start();
    }

}
