package listDataStructure;

import java.util.ArrayList;

public class TraverseArrayList {
    public static void main(String[] args) {

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");
        stringList.add("Grapes");


        System.out.println("Traversing using a regular for loop:");
        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }


        System.out.println("\nTraversing using an enhanced for loop:");

        for (String fruit : stringList) {
            System.out.println(fruit);
        }
    }
}
