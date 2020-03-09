package exc13_Intefaces;

public class DeskPhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
        this.isRinging = false;
    }

    @Override
    public void powerOn() {
        System.out.println("Power on your phone");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Ringing " + phoneNumber + " on your phone");

    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering the desk phone");
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (myNumber == phoneNumber) {
            isRinging = true;
        } else {
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public Boolean isRinging() {
        return isRinging;
    }
}
