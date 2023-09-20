package test;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        boolean isAnagram = true;

        if (str1.length() != str2.length()) {
            isAnagram = false;
        } else {
            char[] chars1 = str1.toCharArray();
            char[] chars2 = str2.toCharArray();
            Arrays.sort(chars1);
            Arrays.sort(chars2);
            isAnagram = Arrays.equals(chars1, chars2);
        }

        if (isAnagram) {
            System.out.println("The strings are anagrams");
        } else {
            System.out.println("The strings are not anagrams");
        }

    }
}
