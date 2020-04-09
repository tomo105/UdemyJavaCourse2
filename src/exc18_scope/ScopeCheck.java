package exc18_scope;

public class ScopeCheck {

    public int publicVar = 0;
    private int varOne = 1; //only in class

    public ScopeCheck() {
        System.out.println("Created ScopeCheck, publicVal = " + publicVar + "privateVal = " + varOne);
    }

    public int getVarOne() {
        return varOne;
    }

    public void timesTwo() {
        int varTwo = 2; // only in method
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " times two is " + i * varTwo);
        }
    }

    public class InnerClass {
        public int var3 = 3;

        public InnerClass() {
            System.out.println("created a inner varOne = " + varOne + "class privateVar = " + var3);
        }

        public void timesTwo() {
            //  int privateVar = 2; // only in method
            ScopeCheck.this.timesTwo();
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " times two is " + i * ScopeCheck.this.varOne);
            }
        }
    }
}
