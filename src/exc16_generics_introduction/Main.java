package exc16_generics_introduction;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> items = new ArrayList();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        //    items.add("sth");
        items.add(5);

        printDoubles(items);
        //---------------------------------------------------------------
        FootballPlayer Tom = new FootballPlayer("Tom");
        SoccerPlayer Harry = new SoccerPlayer("Harry");
        BaseballPlayer Brian = new BaseballPlayer("Brian");
        Team<FootballPlayer> spartaWozuczyn = new Team("Sparta Wozuczyn ");
        spartaWozuczyn.addPlayer(Tom);
        // spartaWozuczyn.addPlayer(Harry);
        // spartaWozuczyn.addPlayer(Brian);

        Team<BaseballPlayer> korona = new Team("Korona");
        korona.addPlayer(Brian);
        Team<BaseballPlayer> korona2 = new Team("Korona kielce");
        korona.addPlayer(Brian);

        Team<SoccerPlayer> soccer = new Team<>("soccker team");
        soccer.addPlayer(Harry);

       // soccer.matchResult(korona, 3, 6); function matchResult is generics
        korona2.matchResult(korona, 3, 6);
        //Team<String>  teamString = new Team("Korona");
        //teamString.addPlayer("ddfs"); //eror with cast but not appropriate type !!!! not string should be Player
        // use class Team <T extens Player> to validate this !!
    }

    private static void printDoubles(ArrayList<Integer> items) {
        for (int i : items) {
            System.out.println(i * 3);
        }
    }
}
