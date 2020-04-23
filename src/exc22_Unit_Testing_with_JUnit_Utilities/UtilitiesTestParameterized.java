package exc22_Unit_Testing_with_JUnit_Utilities;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class UtilitiesTestParameterized {
    private Utilities ut;
    private String input;
    private String output;

    public UtilitiesTestParameterized(String input, String output) {
        this.input = input;
        this.output = output;
    }

    @Before
    public void setup() {
        ut = new Utilities();
    }
    @Parameterized.Parameters
    public static Collection<Object[]> testCollection() {
        return Arrays.asList(new Object[][]{
                {"A", "A"},
                {"ABCDEFF", "ABCDEF"},
                {"1222233344455566", "123456"},
                {"AB**EFFG", "AB*EFG"}
        });
    }

    @Test
    public void removePairs() {
        assertEquals(output,ut.removeDuplicatedCharacter(input));
    }

}
