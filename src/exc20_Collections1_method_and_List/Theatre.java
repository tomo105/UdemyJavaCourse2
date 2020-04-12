package exc20_Collections1_method_and_List;

import java.util.*;

public class Theatre {
    private final String theatreName;
    private List<Seat> seats = new ArrayList<>();
    //no need to be static
    //add comparator to
    static final Comparator<Seat> PRICE_OWNER;

    static {
        PRICE_OWNER = new Comparator<Seat>() {
            @Override
            public int compare(Seat s1, Seat s2) {
                if (s1.getPrice() < s2.getPrice()) {
                    return -1;
                } else if (s1.getPrice() > s2.getPrice()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        };
    }

    public Theatre(String theatreName, int numRows, int numRowSeats) {
        this.theatreName = theatreName;
        int lastRow = (char) 65 + (numRows - 1);
        System.out.println("Last row = " + lastRow + " " + (char) 97);
        for (char row = (char) 65; row <= lastRow; row++) {
            for (int seatNum = 1; seatNum <= numRowSeats; seatNum++) {
                double price = 12.00;
                if (row < 'D' && seatNum >= 4 && seatNum <= 9) {
                    price = 14.00;
                } else if (row > 'F' || (seatNum < 4 || seatNum > 9)) {
                    price = 7.00;
                }
                Seat seat = new Seat(row + String.format("%02d", seatNum), price);
                seats.add(seat);
            }
        }
    }

    public String getTheatreName() {
        return theatreName;
    }

    //use binary search the fastest method
    public boolean reserveSeat(String seatNumber) {
        Seat requestedSeat = new Seat(seatNumber, 0);
        int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
        if (foundSeat >= 0) {
            return seats.get(foundSeat).reserved();
        } else {
            System.out.println("there is not available seat" + seatNumber);
            return false;
        }
    }

    public Collection<Seat> getSeats() {
        return this.seats;
    }

    //it should not be public !!!!
    public class Seat implements Comparable<Seat> {
        private final String seatNumber;
        private double price;
        private boolean reserved = false;

        public Seat(String seatNumber, double price) {
            this.seatNumber = seatNumber;
            this.price = price;
        }

        public double getPrice() {
            return price;
        }

        public boolean reserved() {
            if (!this.reserved) {
                this.reserved = true;
                System.out.println("Reserved a seat: " + seatNumber);
                return true;
            } else {
                return false;
            }
        }

        public boolean cancel() {
            if (this.reserved) {
                this.reserved = false;
                System.out.println("reservation of seat " + seatNumber + " is cancelled");
                return true;
            } else {
                return false;
            }
        }

        public String getSeatNumber() {
            return this.seatNumber;
        }

        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }
    }


}
