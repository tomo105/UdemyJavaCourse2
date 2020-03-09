package exc13_Intefaces;

public class MobilePhone  implements  ITelephone{
    private int myNumber;
    private boolean isRinging;
    private boolean isOn;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
        this.isRinging = false;
        this.isOn = false;
    }

    @Override
    public void powerOn() {
        System.out.println("Power on your phone");
        isOn = true;
    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn) {
            System.out.println("Ringing " + phoneNumber + " on your phone");
        } else {
            System.out.println("Phone is switch off");
        }
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering the desk phone");
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (myNumber == phoneNumber && isOn ) {
            System.out.println("Somebody is ringing.");
            isRinging = true;
        } else {
            System.out.println("Different number.");
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public Boolean isRinging() {
        return isRinging;
    }
}
