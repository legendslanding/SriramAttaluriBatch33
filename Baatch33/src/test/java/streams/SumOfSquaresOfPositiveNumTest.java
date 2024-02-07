package streams;

import org.junit.Assert;
import org.testng.annotations.Test;
import streams.SumOfSquaresOfPositiveNum;

import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class SumOfSquaresOfPositiveNumTest {
    @Test
    public void testSumOfSquareOfPositiveNum(){
        List<Integer> li = List.of(1,2,3);
        Double sum = 14.0;
        Assert.assertEquals(sum , SumOfSquaresOfPositiveNum.sumOfSquaresOfPositive(li));
    }
    @Test
    public void testSumOfSquareOfPositiveNum1(){
        List<Integer> li = List.of(-1,1,-9,2,-20,3);
        Double sum = 14.0;
        assertEquals(sum ,SumOfSquaresOfPositiveNum.sumOfSquaresOfPositive(li));
    }

}
