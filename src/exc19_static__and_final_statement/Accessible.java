package exc19_static__and_final_statement;

public interface Accessible {
    int SOME_CONSTANT = 2000;
// all interface varialbe is public static final
    public void methodA();

    void methodB();

    boolean methodC();
        //all method in interface is public !!!!!!always !!!!
}
