package functionalInterfaces;

import org.testng.annotations.Test;

import java.util.List;
import java.util.function.Predicate;

import static org.junit.Assert.assertEquals;

public class StringFilterStartWithATest {
    @Test
    public void testStringFilterStartWithA(){
        List<String> li = List.of("Apple", "Banana", "Orange", "Avocado", "Grapes");
        Predicate<String> predicate = s -> s.startsWith("A");
        List<String> li1 = List.of("Apple","Avocado");
        assertEquals(li1,StringFilterStartWithA.stringFilterStartWithA(li,predicate));
    }
}
