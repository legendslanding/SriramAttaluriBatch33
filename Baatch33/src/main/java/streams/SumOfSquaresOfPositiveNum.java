package streams;

import java.util.List;

public class SumOfSquaresOfPositiveNum {
    public static Double sumOfSquaresOfPositive(List<Integer> li){
        return li.stream()
                .filter(s -> (s>0))
                .map(s -> Math.pow(s,2))
                .reduce((double) 0, Double::sum);

    }
}
