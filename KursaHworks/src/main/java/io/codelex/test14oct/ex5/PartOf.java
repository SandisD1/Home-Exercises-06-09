package io.codelex.test14oct.ex5;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class PartOf {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        double evenPercent = partOf(numbers, (Integer n) -> n % 2 == 1);

        System.out.println(evenPercent);

    }

    public static <T> double partOf(List<T> list, Function<T, Boolean> func) {

        double origSize = list.size();
        double filtSize = list.stream()
                .filter(func::apply).toList().size();
        double result = filtSize / origSize;
        return result;
    }
}
