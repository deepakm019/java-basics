package test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SortUsingJava8 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("banana", "orange", "apple", "pear");
        List<String> sortedStrings = strings.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedStrings);


        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int threshold = 3;

        Optional<Integer> first = numbers.stream().filter(n -> n > threshold).findFirst();
        System.out.println(first.get());

    }
}
