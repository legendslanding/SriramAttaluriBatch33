package stringOperations;

import org.testng.annotations.Test;
import stringOperations.NumberOfVowels;

import static junit.framework.Assert.assertEquals;

public class NumberOfVowelsTest {

    @Test
    void testCountVowels() {

        assertEquals(2, NumberOfVowels.countVowels("hello"));
    }
    @Test
    void testCountVowels1() {

        assertEquals(0, NumberOfVowels.countVowels("xyz"));
    }

    @Test
    void testCountVowels2() {
        assertEquals(2, NumberOfVowels.countVowels("HeLLo"));
    }

    @Test
    void testCountVowels3() {
        assertEquals(0, NumberOfVowels.countVowels(""));
    }

    @Test
    void testCountVowels4() {
        assertEquals(5, NumberOfVowels.countVowels("aeiou"));
    }

    @Test
    void testCountVowels5() {
        assertEquals(4, NumberOfVowels.countVowels("java is fun"));
    }
}

