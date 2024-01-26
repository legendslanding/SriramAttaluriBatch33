package hashMapDataStructure;

import java.util.HashMap;
import java.util.Map;

public class DistinctCharactersCounter {
    public static Map<Character, Integer> countDistinctCharacters(String input) {
        Map<Character, Integer> charCountMap = new HashMap<>();


        input = input.toLowerCase();


        for (char c : input.toCharArray()) {

            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        return charCountMap;
    }

    /*public static void main(String[] args) {
        String inputString = "test string";
        Map<Character, Integer> charCountMap = countDistinctCharacters(inputString);


        System.out.println("Distinct characters and their counts:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
    }*/
}
