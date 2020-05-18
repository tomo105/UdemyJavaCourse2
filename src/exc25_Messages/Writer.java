package exc25_Messages;

import exc24_MultipleThreads.ThreadColor;

import java.util.Random;

public class Writer implements Runnable {
    private Message message;

    public Writer(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        String[] messages = {
                "alaska elko laska",
                "Hangover part 3",
                "The title of sole survivor",
                "elko melko niedzielko"
        };
        Random random = new Random();
        for(int i=0; i<messages.length;i++) {
            message.write(messages[i]);
            try {
                Thread.sleep(random.nextInt(2000));
            } catch (InterruptedException e) {

            }
        }
        message.write("Finished");
    }
}
