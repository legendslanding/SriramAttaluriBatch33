package streams;

import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

public class ArraysBasedOnCriteriaTest {
    @Test
    public void testArrayBasedOnCriteria(){
        String[] array = {"banana","apple","grapes","cherry","Kiwi","Straw Berry"};
        String[] array1 = {"Kiwi","apple","banana","grapes","cherry","Straw Berry"};
        assertEquals("banana" , ArraysBasedOnCriteria.sortBasedOnLength(array)[2]);
        assertEquals("Kiwi" , ArraysBasedOnCriteria.sortBasedOnLength(array)[0]);
    }
}
