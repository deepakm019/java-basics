package test;

import java.util.ArrayList;

public class CommonElements {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 3, 4, 5, 6, 7 };
        ArrayList<Integer> common = new ArrayList<Integer>();

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    common.add(arr1[i]);
                }
            }
        }

        System.out.println("Common elements: " + common);
    }
}
