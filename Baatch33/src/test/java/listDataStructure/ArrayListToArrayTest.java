package listDataStructure;


import org.junit.Test;

import java.util.ArrayList;

import static org.testng.Assert.assertEquals;


public class ArrayListToArrayTest {

    @Test
    public void testConvertArrayListToArray() {

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");
        stringList.add("Grapes");

        String[] resultArray = ArrayListToArray.convertArrayListToArray(stringList);


        assertEquals(stringList.size(), resultArray.length, "Size of the array should match the size of the ArrayList");


        for (int i = 0; i < stringList.size(); i++) {
            assertEquals(stringList.get(i), resultArray[i], "Element at index " + i + " should match");
        }
    }

    @Test
    public void testConvertEmptyArrayListToArray() {

        ArrayList<String> emptyList = new ArrayList<>();

        String[] resultArray = ArrayListToArray.convertArrayListToArray(emptyList);


        assertEquals(0, resultArray.length, "Resulting array should be empty");
    }
}
