package test;

import java.util.stream.IntStream;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        int sumOfEven = IntStream.rangeClosed(1, 100)
                .filter(n -> n % 2 == 0)
                .sum();

        System.out.println(sumOfEven);

    }
}
