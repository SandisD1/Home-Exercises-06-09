package io.codelex.test14oct.ex3;

import java.util.Arrays;

public class Joiner<T> {
    private final String seperator;

    public Joiner(String seperator) {
        this.seperator = seperator;
    }

    @SafeVarargs
    public final String join(T... args) {
        return Arrays.stream(args).map(T::toString).reduce((a, b) -> a + seperator + b).get();
    }
}
