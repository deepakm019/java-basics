package test;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AverageOfAllNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        OptionalDouble avg = numbers.stream().mapToDouble(Integer::doubleValue).average();
        System.out.println(avg.getAsDouble());
    }
}
