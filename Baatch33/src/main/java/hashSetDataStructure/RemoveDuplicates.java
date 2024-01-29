package hashSetDataStructure;

import java.util.HashSet;

public class RemoveDuplicates {

    public static String removeDuplicates(String input) {
        HashSet<Character> seen = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (seen.add(ch)) {
                result.append(ch);
            }
        }

        return result.toString();
    }

    /*public static void main(String[] args) {
        String inputString = "programming";

        System.out.println("Original String: " + inputString);

        String resultString = removeDuplicates(inputString);

        System.out.println("String after removing duplicates: " + resultString);
    }*/
}

