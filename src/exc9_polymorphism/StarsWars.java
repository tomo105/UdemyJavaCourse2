package exc9_polymorphism;

public class StarsWars extends  Movie {
    public StarsWars() {
        super("StarsWars");

    }

    @Override
    public String plot() {
        return "i do not  watch this movie yet";
    }
}
