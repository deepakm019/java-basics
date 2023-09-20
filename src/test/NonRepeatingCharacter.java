package test;

public class NonRepeatingCharacter {
    public static void main(String[] args) {
        String str = "aabbccdeeff";
        char nonRepeating = ' ';

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (str.indexOf(current) == i && str.lastIndexOf(current) == i) {
                nonRepeating = current;
                break;
            }
        }

        if (nonRepeating == ' ') {
            System.out.println("No non-repeating character found");
        } else {
            System.out.println("The first non-repeating character is: " + nonRepeating);
        }

    }
}
