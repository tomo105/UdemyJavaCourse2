package exc13_Intefaces;

public interface ITelephone {
    void powerOn();

    void dial(int phoneNumber);

    boolean callPhone(int phoneNumber);
    public void answer();

    Boolean isRinging();
}
