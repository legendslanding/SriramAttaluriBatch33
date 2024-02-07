package streams;

import org.junit.Assert;
import org.testng.annotations.Test;
import streams.StringContainsVowels;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class StringContainsVowelsTest {
    @Test
    public void testStringContainsVowels(){
        List<String> li = List.of("Apple","apple","rws","banana");
        List<String> li1 = List.of("apple","apple","banana");
        Assert.assertEquals(li1, StringContainsVowels.stringContainsVowels(li));
    }
    @Test
    public void testStringContainsVowels1(){
        List<String> li = List.of();
        List<String> li1 = List.of();
        assertEquals(li1,StringContainsVowels.stringContainsVowels(li));
    }
}
