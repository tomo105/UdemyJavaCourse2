package exc22_Unit_Testing_with_JUnit_Utilities;

import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

public class UtilitiesTest {
    private Utilities ut;

    @Before
    public void setup() {
        ut = new Utilities();
    }

    @Test
    public void everyNthChar() throws Exception {
        char[] arrayInput = new char[]{'h', 'x', 'l', 'd', 'o'};
        char[] arrayOutput = new char[]{'x', 'd'};
        assertArrayEquals(arrayOutput, ut.everyNthChar(arrayInput, 2));
    }

    @Test
    public void everyNthCharNisGreaterThanLengthOfArray() throws Exception {
        char[] arrayInput = new char[]{'h', 'x', 'l', 'd', 'o'};
        char[] arrayOutput = new char[]{'h', 'x', 'l', 'd', 'o'};
        assertArrayEquals(arrayOutput, ut.everyNthChar(arrayInput, 6));
    }

    @Test
    public void removeDuplicatedCharacter() throws Exception {
        String res = ut.removeDuplicatedCharacter("AABCDDEFF");
        assertEquals("ABCDEF", res);
        res = ut.removeDuplicatedCharacter("ABCCABDEEF");
        assertEquals("ABCABDEF", res);
    }

    @Test
    public void removeDuplicatedCharactersNullParameter() throws Exception {
        assertNull("passed null and return null", ut.removeDuplicatedCharacter(null));
    }

    @Test
    public void removeDuplicatedCharactersEmptyParameter() throws Exception {
        assertEquals("", ut.removeDuplicatedCharacter(""));
    }

    @Test
    public void removeDuplicatedCharactersOneCharacterParameter() throws Exception {
        assertEquals("D", ut.removeDuplicatedCharacter("D"));
    }

    @Test
    public void converter() throws Exception {
        assertEquals(300, ut.converter(10, 5));
    }

    @Test(expected = ArithmeticException.class)
    public void converterZeroParameter() throws Exception {
        ut.converter(10, 0);
    }

    @Test
    public void nullIfOddLengthPassedEven() throws Exception {
        assertNotNull(ut.nullIfOddLength("Tomasz"));
    }

    @Test
    public void nullIfOddLengthPassedOdd() throws Exception {
        assertNull(ut.nullIfOddLength("Tomek"));
    }
}