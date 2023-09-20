package test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArraysWithoutDuplicates {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 4, 4, 5 };
        Set<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        int[] result = new int[set.size()];
        int index = 0;

        for (int num : set) {
            result[index++] = num;
        }

        System.out.println("Array without duplicates: " + Arrays.toString(result));

    }
}
