package io.codelex.test14oct.ex3;

public class Joiner<T> {
    private final String seperator;

    public Joiner(String seperator) {
        this.seperator = seperator;
    }

    @SafeVarargs
    public final String join(T... args) {
        StringBuilder joined = new StringBuilder();

        for (T a : args) {
            joined.append(a.toString()).append(seperator);
        }
        return joined.substring(0, joined.length() - seperator.length());
    }
}
