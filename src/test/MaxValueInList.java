package test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxValueInList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> max = numbers.stream().max(Integer::compareTo);
        System.out.println(max.get());

    }
}
