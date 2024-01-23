package stringOperations;
import java.util.*;
import java.lang.*;
public class NumberOfVowels {
    public static void main(String args[]) {
        NumberOfVowels s = new NumberOfVowels();
        NumberOfVowels.countVowels(s.toString());

    }

    public static int countVowels(String st) {
        int count = 0;
        st = st.toLowerCase();
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) == 'a' || st.charAt(i) == 'e'
                    || st.charAt(i) == 'i'
                    || st.charAt(i) == 'o'
                    || st.charAt(i) == 'u') {

                count++;
            }
        }
        return count;
    }
}