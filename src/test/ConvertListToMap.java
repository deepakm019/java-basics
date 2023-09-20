package test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ConvertListToMap {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "orange", "pear");
        Map<String, Integer> stringLengths = strings.stream()
                .collect(Collectors.toMap(Function.identity(), String::length));
        System.out.println(stringLengths);
    }
}
