package streams;

import java.util.List;
import java.util.stream.Collectors;

public class StringContainsVowels {
    public static List<String> stringContainsVowels(List<String> li){
        if(li.isEmpty()){
            return li;
        }
        return li.stream()
                .map(String::toLowerCase)
                .filter(s -> (s.contains("a") || s.contains("e") || s.contains("i") || s.contains("o") || s.contains("u")))
                .collect(Collectors.toList());
    }
    /*public static void main(String[] args){
        List<String> li = List.of("Apple","apple","rws","banana");
        System.out.println(StringContainsVowels.stringContainsVowels(li));
    }*/
}
