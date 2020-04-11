package exc20_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("Notre Dame", 8, 12);
        //theatre.getSeats();

        reserve(theatre, "C04");

        List<Theatre.Seat> seatsCopy = new ArrayList<>(theatre.seats);
        printList(seatsCopy);
        seatsCopy.get(1).reserved();

        reserve(theatre, "A02");
        //sort in reverse order to see our seat A02
        Collections.shuffle(seatsCopy);
        System.out.println("print seats copy: ");
        printList(seatsCopy);
        System.out.println("printing original seats:");
        printList(theatre.seats);

        Theatre.Seat minSeat = Collections.min(seatsCopy);
        Theatre.Seat maxSeat = Collections.max(seatsCopy);

        System.out.println(" min seat " + minSeat.getSeatNumber());
        System.out.println(" max seat " + maxSeat.getSeatNumber());
        sortList(seatsCopy);
        printList(seatsCopy);
        List<Theatre.Seat> newList = new ArrayList<>(300);
        newList = theatre.seats;
        System.out.println("new list");
        printList(newList);
        Collections.shuffle(seatsCopy);
        Collections.copy(newList, seatsCopy);
        System.out.println("new list :");
        printList(newList);
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
            System.out.print(" " + seat.getSeatNumber());
        }

        System.out.println("----------------------------");
    }

    public static void sortList(List<? extends Theatre.Seat> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).compareTo(list.get(j)) > 0) {
                    Collections.swap(list, i, j);
                }
            }
        }
    }
}
