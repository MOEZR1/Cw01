import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
    public static void main(String[] args) {
        // Run the test class using JUnitCore
        Result result = JUnitCore.runClasses(Dec2HexTest.class);

        // Iterate through and print details of any failed tests
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        // Print the overall test result
        if (result.wasSuccessful()) {
            System.out.println("All tests passed successfully.");
        } else {
            System.out.println("Some tests failed.");
        }
    }
}
