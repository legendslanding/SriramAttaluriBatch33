package listDataStructure;

import java.util.ArrayList;

public class RemoveLastObject {

    /*public static void main(String[] args) {

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");
        stringList.add("Grapes");

        System.out.println("Original ArrayList: " + stringList);


        removeLastObject(stringList);

        System.out.println("ArrayList after removing the last object: " + stringList);
    }*/


    public static ArrayList<String> removeLastObject(ArrayList<String> list) {
        if (!list.isEmpty()) {
            list.remove(list.size() - 1);
        }
        return list;
    }
}
