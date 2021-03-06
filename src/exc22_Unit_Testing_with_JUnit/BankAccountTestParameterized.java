package exc22_Unit_Testing_with_JUnit;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class BankAccountTestParameterized {
    private BankAccount account;
    private double amount;
    private boolean branch;
    private double expected;

    public BankAccountTestParameterized(double amount, boolean branch, double expected) {
        this.amount = amount;
        this.branch = branch;
        this.expected = expected;
    }

    @Before
    public void setup() {
        account = new BankAccount("Tom", "the one", 1000.0, BankAccount.CHECKING);
        System.out.println("Running a test ..");
    }
    @Parameterized.Parameters
    public static Collection<Object[]> testCollections() {
        return Arrays.asList(new Object[][]{
                {100.00, true, 1100.00},
                {202.14, true, 1202.14},
                {489.33, true, 1489.33},
                {340.23, true, 1340.23},
                {1000.00, true, 2000.00},
        });
    }
    // we create a constructor to use this parameters


    @Test
    public void deposit() throws Exception {
        double balance = account.deposit(amount, branch);
        assertEquals(expected, account.getBalance(), 0.001);
    }
}
