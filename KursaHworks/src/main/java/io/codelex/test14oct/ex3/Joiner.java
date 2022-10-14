package io.codelex.test14oct.ex3;

public class Joiner<T> {
    private final String seperator;

    public Joiner(String seperator) {
        this.seperator = seperator;
    }

    public String join(T... args) {
        StringBuilder joined = new StringBuilder();

        for (T a : args) {
            joined.append(a.toString() + seperator);
        }
        joined.deleteCharAt(joined.length() - seperator.length());
        return joined.substring(0, joined.length() - seperator.length() + 1);
    }
}
