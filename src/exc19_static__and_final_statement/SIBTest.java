package exc19_static__and_final_statement;

public class SIBTest {
    public static final String owner;

    static {
        owner = "tom";
        System.out.println("SIBTest static initialization block called ");
    }

    public SIBTest() {
        System.out.println("SIBTest constructor called");
    }

    static {
        System.out.println("second initialization block called");
    }

    public void someMethod() {
        System.out.println("someMethod called");
    }
}
