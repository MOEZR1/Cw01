import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;

public class Dec2HexTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testValidIntegerInput() {
        assertEquals("A", Dec2Hex.convertToHex(10));
        assertEquals("0", Dec2Hex.convertToHex(0)); // Test edge case
    }

    @Test
    public void testNoInputArgument() {
        Dec2Hex.main(new String[]{});
        assertTrue(outContent.toString().contains("Error: No input argument provided."));
    }

    @Test
    public void testNonIntegerInput() {
        Dec2Hex.main(new String[]{"abc"});
        assertTrue(outContent.toString().contains("Error: The provided input is not a valid integer."));
    }
}
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;

public class Dec2HexTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testValidIntegerInput() {
        assertEquals("A", Dec2Hex.convertToHex(10));
        assertEquals("0", Dec2Hex.convertToHex(0)); // Test edge case
    }

    @Test
    public void testNoInputArgument() {
        Dec2Hex.main(new String[]{});
        assertTrue(outContent.toString().contains("Error: No input argument provided."));
    }

    @Test
    public void testNonIntegerInput() {
        Dec2Hex.main(new String[]{"abc"});
        assertTrue(outContent.toString().contains("Error: The provided input is not a valid integer."));
    }
}
