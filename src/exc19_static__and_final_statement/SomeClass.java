package exc19_static__and_final_statement;

public class SomeClass {
    private static int classCounter = 0;
    public final int instanceNumber;
    private final String name;
    private static final String CONSTANT = "const value";

    public SomeClass(String name) {
        classCounter++;
        this.instanceNumber = classCounter;
        this.name = name;
        System.out.println("Create " + name + "instance nr: " + instanceNumber);
    }

    public int getInstanceNumber() {
        return instanceNumber;
    }
}
