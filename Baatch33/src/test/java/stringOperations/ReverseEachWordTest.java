package stringOperations;

import org.testng.annotations.Test;
import stringOperations.ReverseEachWord;

import static junit.framework.Assert.assertEquals;

public class ReverseEachWordTest {
    @Test
    void testReverseEachWord() {
        assertEquals("avaJ EE2J esreveR eM", ReverseEachWord.reverseEachWord("Java J2EE Reverse Me"));
    }
    @Test
    void testReverseEachWord1() {
        assertEquals("", ReverseEachWord.reverseEachWord(""));
    }

    @Test
    void testReverseEachWord2() {
        assertEquals("drow", ReverseEachWord.reverseEachWord("word"));
    }

    @Test
    void testReverseEachWord3() {
        assertEquals("dcba hgfe", ReverseEachWord.reverseEachWord("abcd efgh"));
    }

    @Test
    void testReverseEachWord4() {
        assertEquals(" dcba hgfe ", ReverseEachWord.reverseEachWord(" abcd efgh "));
    }

    @Test
    void testReverseEachWord5() {

        assertEquals("avaJ", ReverseEachWord.reverseWord("Java"));
    }

    @Test
    void testReverseEachWord6() {
        assertEquals("", ReverseEachWord.reverseWord(""));
    }

    @Test
    void testReverseEachWord7() {
        assertEquals("a", ReverseEachWord.reverseWord("a"));
    }

    @Test
    void testReverseEachWord8() {
        assertEquals("tac", ReverseEachWord.reverseWord("cat"));
    }

    @Test
    void testReverseEachWord9() {
        assertEquals("desserts", ReverseEachWord.reverseWord("stressed"));
    }
}
