package Day36;

import org.junit.jupiter.api.Test;

public class DemoTest2 {

    @Test
    void testcase01() {
        System.out.println("start testing");
        String res = testcase02();
        System.out.println("testing is done " + res);
    }
    
    private String testcase02() {
        System.out.println("we are in testcase02");

        try{
            Thread.sleep(1000);
        }catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
            System.err.println("execution got interrupted: " + ex.getMessage());
        }
        return "success msg";
    }
}