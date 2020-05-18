package exc25_Messages;

public class Message {
    private String message;
    private boolean empty = true;


    public synchronized String read() {
        while (empty) {
            try {
                wait();
            } catch (InterruptedException e) {

            }
        }
        empty = true;
        notifyAll(); //  ,m
        return message;
    }

    public synchronized void write(String message) {
        if (!empty) {
            try {
                wait(); // suspend
            } catch (InterruptedException e) {

            }
        }
        empty = false;
        this.message = message;
        notifyAll();

    }
}
