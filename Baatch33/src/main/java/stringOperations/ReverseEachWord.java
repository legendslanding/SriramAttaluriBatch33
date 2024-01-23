package stringOperations;

public class ReverseEachWord {

    public static String reverseEachWord(String sentence) {

        String[] words = sentence.split(" ");


        for (int i = 0; i < words.length; i++) {
            words[i] = reverseWord(words[i]);
        }


        return String.join(" ", words);
    }

    public static String reverseWord(String word) {

        char[] charArray = word.toCharArray();


        int start = 0;
        int end = charArray.length - 1;

        while (start < end) {

            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;


            start++;
            end--;
        }


        return new String(charArray);
    }

    public static void main(String[] args) {
        String inputSentence = "Java J2EE Reverse Me";
        String reversedSentence = reverseEachWord(inputSentence);

        System.out.println("Input: " + inputSentence);
        System.out.println("Output: " + reversedSentence);
    }
}
