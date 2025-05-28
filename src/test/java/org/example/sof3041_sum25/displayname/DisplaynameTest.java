package org.example.sof3041_sum25.displayname;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Displayname Test Class")
public class DisplaynameTest {

    @Test
    @DisplayName("dummy test")
    void dummy() {
        // dummy test
    }

    @Test
    @DisplayName("Example Test Method with No Business Logic")
    void test() {
        assertTrue(3 > 0);
    }

    @Test
    @DisplayName("MyTestMethod")
    void test1(TestInfo testInfo) {
        assertEquals("MyTestMethod", testInfo.getDisplayName());
    }

}
