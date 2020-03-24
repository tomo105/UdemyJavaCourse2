package exc16_generics_introduction;

import java.util.ArrayList;

// extens class & interface & interface & ...
public class Team<T extends Player> {
    private String name;
    int played = 0;
    int won = 0;
    int loss = 0;
    int tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player) {
        if (members.contains(player)) {
            System.out.println("you have already this player: " + player.getName());
            return false;
        } else {
            members.add(player);
            System.out.println("player added: " + player.getName());
            return true;
        }
    }

    public int numPlayers() {
        return this.members.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
        String message;
        if (ourScore > theirScore) {
            this.won++;
            message = " won ";
        } else if (theirScore == ourScore) {
            this.tied++;
            message = " tied ";
        } else {
            loss++;
            message = " lost ";
        }
        if (opponent != null) {
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return (this.won * 2) + this.tied;
    }

}
