package exc19_static__and_final_statement;

// you want to create a class to encrypt a password
//make sure that no one can extends this class and change it itself
// --> you need to create final class!!

public class Password {


    private static int key = 34253245;
    private final int encryptedPassword;

    public Password(int encryptedPassword) {
        this.encryptedPassword = encryptedDecrypt(encryptedPassword);
    }

    private int encryptedDecrypt(int encryptedPassword) {
        return encryptedPassword ^ key;
    }

    public final void storePassword() {
        System.out.println("Saving password as " + this.encryptedPassword);
    }

    public boolean letMeIn(int password) {
        if (encryptedDecrypt(password) == encryptedPassword) {
            System.out.println("Came in");
            return true;
        } else {
            System.out.println("Nope, get out");
            return false;
        }
    }
}
