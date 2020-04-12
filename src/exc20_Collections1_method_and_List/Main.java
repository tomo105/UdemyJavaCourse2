package exc20_Collections1_method_and_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("Notre Dame", 8, 12);
        //theatre.getSeats();

        reserve(theatre, "C04");
        reserve(theatre,"C44");
        ArrayList<Theatre.Seat> copy  = new ArrayList<>(theatre.getSeats());
        printList(copy);
        Collections.reverse(copy);
        printList(copy);

        List<Theatre.Seat> priceSeats = new ArrayList<>(theatre.getSeats());
        priceSeats.add(theatre.new Seat("B00", 13.00));
        priceSeats.add(theatre.new Seat("A00", 13.00));
        Collections.sort(priceSeats,Theatre.PRICE_OWNER);
        System.out.println("sorted prices");
        printList(priceSeats);
    }

    private static void reserve(Theatre theatre, String seatNumber) {
        if (theatre.reserveSeat(seatNumber)) {
            System.out.println("reserved");
        } else {
            System.out.println("not reserved");
        }
    }

    public static void printList(List<Theatre.Seat> list) {
        for (Theatre.Seat seat : list) {
            System.out.print(" " + seat.getSeatNumber() + " price: " + seat.getPrice() );
        }

        System.out.println("----------------------------");
    }
}
//    public static void sortList(List<? extends Theatre.Seat> list) {
//        for (int i = 0; i < list.size() - 1; i++) {
//            for (int j = i + 1; j < list.size(); j++) {
//                if (list.get(i).compareTo(list.get(j)) > 0) {
//                    Collections.swap(list, i, j);
//                }
//            }
//        }
//    }

