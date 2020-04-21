package exc22_Unit_Testing_with_JUnit;

import org.junit.*;

import static junit.framework.TestCase.*;

public class BankAccountTest {
    private BankAccount account;
    private static int count;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("this executes before Count equals: " + count++);
    }

    @Before
    public void setup() {
        account = new BankAccount("Tom", "Master", 1000.0, BankAccount.CHECKING);
        System.out.println("Running a test... ");
    }

    @Test
    public void deposit() throws Exception {
        double balance = account.deposit(200, true);
        assertEquals(1200.00, balance, 0);
        // delta is a small difference that we can add to
        // for example if double is 12.4444444
    }

    @Test
    public void withdraw_branch() throws Exception {
        double balance = account.withdraw(600.00, true);
        assertEquals(400.00, balance, 0);
    }

    //try {} catch(){} method use to dewal with exception before !!!
    @Test (expected = IllegalArgumentException.class)
    public void withdraw_notBranch() throws Exception {
       // try {
            account.withdraw(600.00, false);
            fail("Should thrown IllegalArgumentException");
        //    assertEquals(400.00, account.getBalance(), 0);
     //   } catch (IllegalArgumentException e) {


        //  }
    }

    @Test
    public void getBalance_deposit() throws Exception {
        double balance = account.deposit(200, true);
        assertEquals(1200.00, account.getBalance(), 0);
    }
    @Test
    public void getBalance_withdraw() throws Exception {
        account.withdraw(100.0, true);

        assertEquals(900.00, account.getBalance(), 0);
    }

    @Test
    public void isChecking_true() {
        assertTrue("The account is NOT a checking account  ", account.isChecking());
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("this executes after the tests cases, Count equals " + count++);
    }

    @After
    public void teardown() {
        System.out.println("Count " + count++);
    }
}