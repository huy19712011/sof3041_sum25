package org.example.sof3041_sum25.assertions;

import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionsExample {

    @Test
    @DisplayName("This will Fail")
    void test_fail() {

        //fail();

        //fail("Not yet implemented");

        //fail(() -> {
        //    return "Not yet implemented";
        //});

        //fail("Not Yet Implemented", new RuntimeException("Explicitly Failed"));

        fail(new RuntimeException("Explicitly Failed"));


    }
}
