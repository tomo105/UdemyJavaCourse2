package exc9_encapsulation;

public class Printer {
    private int tonerLevel = 100;
    private int numberOfPagesPrinted = 0;
    private boolean isDuplex;

    public Printer(int tonerLevel, int numberOfPagesPrinted, boolean isDuplex) {

        if (tonerLevel > 0 && tonerLevel <= 100)
            this.tonerLevel = tonerLevel;
        if (numberOfPagesPrinted > 0)
            this.numberOfPagesPrinted = numberOfPagesPrinted;
        this.isDuplex = isDuplex;
    }

    public void fillTheToner(int tonerLevel) {
        if (tonerLevel < 0)
            return;
        else if (this.tonerLevel + tonerLevel > 100)
            this.tonerLevel = 100;
        else
            this.tonerLevel += tonerLevel;

        System.out.println("toner level after add " + tonerLevel + " is: " + this.tonerLevel);
    }

    public void printPages(int pages) {
        if (pages < 0) {
            System.out.println("Wrong pages number to print it");

        } else if (pages > tonerLevel) {
            System.out.println("You have to little toner to print it");

        } else {
            if (pages % 2 == 0) {
                this.tonerLevel -= pages;
                this.numberOfPagesPrinted += (pages/2);
            } else {
                this.tonerLevel -= pages;
                this.numberOfPagesPrinted += pages;
                System.out.println("number of pages printed by printer: " + this.numberOfPagesPrinted + " and toner level is: " +
                        this.tonerLevel);
            }
        }

    }

}
