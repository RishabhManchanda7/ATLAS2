package Day36;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertTrue;


public class DemoTest7 {


    @Test
    @Tag("slow")
    void slowTest() {
        assertTrue(true, "slow test method");
    }


    @Test
    @Tag("fast")
    void fastTest() {
        assertTrue(true, "fast test method");
    }


    @Test
    @Tag("fast")
    @Tag("integration")
    void fastIntegrationTest() {
        assertTrue(true, "fast integration test methid");
    }
}
