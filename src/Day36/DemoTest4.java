package Day36;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
/*Assumptions in JUnit 5 - checks the test cases conditionally based on preconditions.
if Assumption is failed then it is marked as skipped rather than failed.
Means Assumptions are used when we want to skip a test.


assumeTrue() - used to skip the test when a specified condition is not true for assumeTrue or not false for assumeFalse.
assumingThat() - to execute a block of code based on a Boolean Assumptions, If the Assumptions is false the block is skipped.*/


public class DemoTest4 {


    @Test
    void Testcase1() {
        // Set default to true if property not set
        String runTestProperty = System.getProperty("runTest", "true");
        boolean condition = "true".equalsIgnoreCase(runTestProperty);
        Assumptions.assumeTrue(condition, "as the condition is not met skip test case");
        int result = testcase2();
        Assertions.assertEquals(10, result, "value need to be 10");
    }


    private int testcase2() {
        return 10;
    }
}
