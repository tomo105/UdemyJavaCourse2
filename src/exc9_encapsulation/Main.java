package exc9_encapsulation;

public class Main {
    public static void main(String[] args) {
        //-----------------------------------------------------Encaplsulation---------------------------------------
        //bad example of use
        Player player = new Player();
        player.name = "tim";
        player.health = 100;
        player.weapon = "knife";
        int damage = 10;

        player.loseHealth(damage);
        player.healthRemaining();
        player.health = 300; //not really want to do
        player.loseHealth(100);
        player.healthRemaining();
        //------------------------------------------------------------------------------
        //good example
        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Tom", 30,"knife");
        enhancedPlayer.loseHealth(34);
        enhancedPlayer.getHealth();

        System.out.println("-----------------");
        Printer printer = new Printer(100,1234,true);
        printer.printPages(33);
        printer.fillTheToner(1);
        printer.printPages(80);
        printer.fillTheToner(40);
        printer.printPages(80);


    }
}
