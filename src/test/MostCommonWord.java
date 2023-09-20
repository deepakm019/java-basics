package test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostCommonWord {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "pear", "apple");
        Map<String, Long> wordCounts = words.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        String mostCommonWord = wordCounts.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey();

        System.out.println(mostCommonWord);
    }
}
