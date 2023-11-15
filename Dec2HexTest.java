import org.junit.Test;
import static org.junit.Assert.*;

public class Dec2HexTest {

    /**
     * Test to ensure that the convertToHex method returns the correct hexadecimal
     * representation for a valid decimal input.
     */
    @Test
    public void testValidIntegerInput() {
        assertEquals("FF", Dec2Hex.convertToHex(255));
        assertEquals("0", Dec2Hex.convertToHex(0));  // Test edge case
    }

    /**
     * Test to ensure that the main method throws IllegalArgumentException when no input
     * argument is provided.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testNoInputArgument() {
        Dec2Hex.main(new String[] {});
    }

    /**
     * Test to ensure that the main method throws NumberFormatException when a non-integer
     * input is provided.
     */
    @Test(expected = NumberFormatException.class)
    public void testNonIntegerInput() {
        Dec2Hex.main(new String[] {"abc"});
    }
}
