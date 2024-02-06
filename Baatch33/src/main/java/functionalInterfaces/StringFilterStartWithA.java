package functionalInterfaces;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StringFilterStartWithA {
    public static List<String> stringFilterStartWithA(List<String> li, Predicate<String> predicate){
        return li.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }
}
