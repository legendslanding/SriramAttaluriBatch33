package hashSetDataStructure;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;

import static org.junit.Assert.assertEquals;

public class HashSetForLoopTest {
    @Test
    public void testHashSetIterator() {

        HashSet<String> hs = new HashSet<>();

        hs.add("Banana");
        hs.add("Grapes");
        hs.add("Apple");
        hs.add("Kiwi");
        hs.add("Orange");
        hs.add("Papaya");
        hs.add("Custer apple");
        hs.add("Pineapple");
        hs.add("Cherry");
        hs.add("Blackberry");





        ArrayList<String> expectedOutput = new ArrayList<>(hs);

        assertEquals(expectedOutput,HashSetForLoop.hashSetForLoop(hs));





    }
}
