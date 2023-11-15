import org.junit.Test;
import static org.junit.Assert.*;

public class Dec2HexTest {

    @Test
    public void testValidDecimal() {
        String hex = Dec2Hex.convertToHex(10);
        assertEquals("A", hex);
    }

    @Test
    public void testZero() {
        String hex = Dec2Hex.convertToHex(0);
        assertEquals("0", hex);
    }

    @Test
    public void testNegativeDecimal() {
        String hex = Dec2Hex.convertToHex(-10);
        assertEquals("Invalid Input", hex);
    }

    @Test
    public void testLargeDecimal() {
        String hex = Dec2Hex.convertToHex(255);
        assertEquals("FF", hex);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNoInput() {
        Dec2Hex.convertToHex(null);
    }
}
