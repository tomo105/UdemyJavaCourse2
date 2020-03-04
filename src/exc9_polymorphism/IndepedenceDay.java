package exc9_polymorphism;

public class IndepedenceDay extends Movie {
    public IndepedenceDay() {
        super("IndependenceDay");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over planet";
    }
}
