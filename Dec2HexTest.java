import org.junit.Test;
import static org.junit.Assert.*;

public class Dec2HexTest {

    /**
     * Tests the convertToHex method with a valid integer input.
     * The expected output for decimal 255 is hexadecimal "FF".
     */
    @Test
    public void testValidIntegerInput() {
        String result = Dec2Hex.convertToHex(255);
        assertEquals("FF", result);
    }

    /**
     * Tests the main method with no arguments.
     * Expects an IllegalArgumentException due to no arguments provided.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testNoInputArgument() {
        // Redirects the standard error to prevent the exception message from appearing in the console during tests.
        System.setErr(new java.io.PrintStream(new java.io.OutputStream() {
            @Override
            public void write(int b) {
                // NO-OP
            }
        }));

        Dec2Hex.main(new String[]{});
    }

    /**
     * Tests the main method with a non-integer input.
     * Expects a NumberFormatException due to invalid number format.
     */
    @Test(expected = NumberFormatException.class)
    public void testNonIntegerInput() {
        // Redirects the standard error to prevent the exception message from appearing in the console during tests.
        System.setErr(new java.io.PrintStream(new java.io.OutputStream() {
            @Override
            public void write(int b) {
                // NO-OP
            }
        }));

        Dec2Hex.main(new String[]{"abc"});
    }
}
