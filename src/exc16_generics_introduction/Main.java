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
        Team<BaseballPlayer> virus = new Team("Virus");
        korona.addPlayer(Brian);
        Team<BaseballPlayer> bayern = new Team<>("Bayern Monachium");
        Team<SoccerPlayer> soccer = new Team<>("soccker team");
        soccer.addPlayer(Harry);

       // soccer.matchResult(korona, 3, 6); function matchResult is generics
        virus.matchResult(korona, 9, 6);
        virus.matchResult(bayern,4,3);
        bayern.matchResult(korona,4,7);
        //Team<String>  teamString = new Team("Korona");
        //teamString.addPlayer("ddfs"); //eror with cast but not appropriate type !!!! not string should be Player
        // use class Team <T extens Player> to validate this !!

        System.out.println(korona.getName() + " " + korona.ranking() );
        System.out.println(virus.getName() + " " + virus.ranking());
        System.out.println(bayern.getName() + " " + bayern.ranking());


//        System.out.println(virus.compareTo(korona));
//        System.out.println(virus.compareTo(bayern));
//        System.out.println(bayern.compareTo(korona));
//        System.out.println(korona.compareTo(bayern));
//        // specific type of generics which could be store in this league
        // by using <Team<BaseballPlayer>> so if i want add other player that will show an error !!!
        League<Team<BaseballPlayer>> primeraDivision = new League<>("Primera Division");
        primeraDivision.addTeamToLeague(korona);
        primeraDivision.addTeamToLeague(virus);
        primeraDivision.addTeamToLeague(bayern);
        System.out.println("Members of Primera Division: ");
        //primeraDivision.addTeamToLeague(soccer);
        primeraDivision.printLeagueMembers();

    }

    private static void printDoubles(ArrayList<Integer> items) {
        for (int i : items) {
            System.out.println(i * 3);
        }
    }
}
