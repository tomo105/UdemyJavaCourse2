package exc16_generics_introduction;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team>  {
    private String name;
    private ArrayList<T> teams=  new ArrayList<T>();;

    public League(String name) {
     //   this.teams =
        this.name = name;
    }

    public boolean addTeamToLeague(T nTeam) {
        if (this.teams.contains(nTeam)) {
            return false;
        } else {
            this.teams.add(nTeam);
            return true;
        }
    }

    public void printLeagueMembers() {
        Collections.sort(teams);
        for( T t : teams){
            System.out.println(t.getName() + " " + t.ranking());
        }
    }

}
