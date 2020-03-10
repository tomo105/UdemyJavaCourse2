package exc14_inner_classes;

import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static Button button = new Button("Print");

    public static void main(String[] args) {

//        Gearbox lotus = new Gearbox(6);
//        lotus.operateClutch(true);
//        lotus.changeGear(1);
//        lotus.operateClutch(false);
//        System.out.println(lotus.wheelSpeed(1000));
//        lotus.changeGear(2);
//        System.out.println(lotus.wheelSpeed(3000));
//        lotus.operateClutch(true);
//        lotus.changeGear(3);
//        lotus.operateClutch(false);
//        System.out.println(lotus.wheelSpeed(6000));


//---------------------------------LOCAL CLASS

//        class ClickListener implements Button.OnClickListener { //LOCAL CLASS !!!!!!!!!!!!!
//            public ClickListener() {
//                System.out.println("Hello");
//            }
//
//            @Override
//            public void onClick(String title) {
//                System.out.println("elko " + title);
//            }
//        }
//
//        button.setOnClickListener(new ClickListener());

        //____________________________Create anonnymus class
        button.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println("anonymus!!!");

            }
        });
        listen();

    }

    private static void listen() {
        boolean quite = false;
        while (!quite) {
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 0:
                    quite = true;
                    break;
                case 1:
                    button.onClick();
            }
        }
    }
}
