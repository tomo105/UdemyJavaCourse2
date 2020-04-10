package exc19_static__and_final_statement;

public class ExtendPassword extends Password {
    private int decryptedPassword;
    public ExtendPassword(int encryptedPassword) {
        super(encryptedPassword);
        this.decryptedPassword = encryptedPassword;
    }

//    @Override
//    public void storePassword() {
//        System.out.println("Saving password as: " + decryptedPassword );
//    }
}
