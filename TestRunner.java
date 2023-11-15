import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
 
public class TestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(Dec2HexTest.class);
        int fails = 0;
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
            fails++;
        }
        if (fails > 0) {
            System.out.println(result.wasSuccessful());
            System.exit(1);
        }
        System.out.println("All tests passed.");
        System.exit(0);
    }
}
