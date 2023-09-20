package test;

public class MissingElement {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 6, 7 };
        int n = 7;
        int sum = n * (n + 1) / 2;
        int missing = sum;

        for (int i = 0; i < arr.length; i++) {
            missing -= arr[i];
        }

        System.out.println("Missing number: " + missing);

    }
}
