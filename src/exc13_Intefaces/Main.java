package exc13_Intefaces;

public class Main {
    public static void main(String[] args) {
        ITelephone tomPhone;   /// can make a instance of a interface
        tomPhone = new DeskPhone(234231);
        tomPhone.answer();
        tomPhone.callPhone(22343);
        tomPhone.isRinging();

        tomPhone = new MobilePhone(2345);  //because they both implement interface ITelephone
        tomPhone.powerOn();
        tomPhone.callPhone(2345);
        tomPhone.answer();

    }
}
