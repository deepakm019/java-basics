package test;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterValuesGreaterThanThreshold {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 3);
        map.put("banana", 5);
        map.put("orange", 4);
        map.put("pear", 2);

        int threshold = 3;

        Map<String, Integer> filteredMap = map.entrySet().stream()
                .filter(entry -> entry.getValue() > threshold)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(filteredMap);

    }
}
