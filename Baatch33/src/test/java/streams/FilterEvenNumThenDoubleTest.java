package streams;

import org.junit.Assert;
import org.testng.annotations.Test;
import streams.FilterEvenNumThenDouble;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FilterEvenNumThenDoubleTest {
    @Test
    public void testFilterEvenNumThenDouble(){
        List<Integer> li = List.of(1,2,3,4,5,6);
        List<Integer> li1 = List.of(4,8,12);
        Assert.assertEquals(li1, FilterEvenNumThenDouble.filterEvenNumThenDouble(li));
    }
}
