package test;

import java.util.Arrays;
import java.util.List;

public class CountNoOfElementsInList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        long count = numbers.stream().count();
        System.out.println(count);

    }
}
