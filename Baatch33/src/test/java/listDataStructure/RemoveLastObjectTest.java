package listDataStructure;

import org.junit.Test;


import java.util.ArrayList;

import static org.testng.Assert.*;

public class RemoveLastObjectTest {

    @Test
    public void testRemoveLastObjectFromNonEmptyList() {

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");
        stringList.add("Grapes");

        stringList = RemoveLastObject.removeLastObject(stringList);

        assertEquals(3, stringList.size(), "Size should be reduced by 1");
        assertEquals("Apple", stringList.get(0), "First element should remain unchanged");
        assertEquals("Banana", stringList.get(1), "Second element should remain unchanged");
        assertEquals("Orange", stringList.get(2), "Third element should remain unchanged");
        assertFalse(stringList.contains("Grapes"), "Last object 'Grapes' should be removed");
    }

    @Test
    public void testRemoveLastObjectFromEmptyList() {

        ArrayList<String> emptyList = new ArrayList<>();

        RemoveLastObject.removeLastObject(emptyList);

        assertTrue(emptyList.isEmpty(), "List should remain empty");
    }

    @Test
    public void testRemoveLastObjectFromSingletonList() {

        ArrayList<String> singletonList = new ArrayList<>();
        singletonList.add("SingleElement");

        RemoveLastObject.removeLastObject(singletonList);

        assertTrue(singletonList.isEmpty(), "List should become empty");
    }
}
