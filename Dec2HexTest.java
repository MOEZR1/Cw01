import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
 
public class Dec2HexTest {
 
    private Dec2Hex dec2Hex;
 
    @Before
    public void setUp() {
        dec2Hex = new Dec2Hex();
    }
 
    @Test
    public void testValidIntegerInput() {
        // Assume a method exists in Dec2Hex that converts the integer to hex
        String result = Dec2Hex.convertToHex(255);
        assertEquals("FF", result);
    }
 
    @Test(expected = IllegalArgumentException.class)
    public void testNoInputArgument() {
        // Assume a method exists in Dec2Hex that handles no input and throws an exception
        Dec2Hex.main(new String[]{});
    }
 
    @Test(expected = NumberFormatException.class)
    public void testNonIntegerInput() {
        // Assume a method exists in Dec2Hex that handles bad input and throws an exception
        Dec2Hex.main(new String[]{"abc"});
    }
}
