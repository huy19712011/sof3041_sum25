package org.example.sof3041_sum25.parameterizedtests;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class MethodSources {

    public static Stream<Arguments> msMP() {
        return Stream.of(Arguments.of(1, "A"), Arguments.of(2, "B"), Arguments.of(3, "C"));
    }
}
