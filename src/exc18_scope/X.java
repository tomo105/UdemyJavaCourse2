package exc18_scope;

public class X {
    public int x;

    public X(int x) {
        this.x = x;
    }

    public void x() {

        for (int x = 0; x <= this.x; x++) {
            System.out.println("this.x * (x = " + x + ") " + " = " + this.x * x);
        }
    }
}
