package hashSetDataStructure;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetForEach {

    public static ArrayList<String> hashSetForEach(HashSet hs){
        ArrayList<String> fruits = new ArrayList<>();
        for(Object element: hs){
            fruits.add((String) element);
            //System.out.println(element);
        }
        return fruits;

    }
    /*public static void main(String[] args){
        HashSetForEach h = new HashSetForEach();
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

        h.hashSetForEach(hs);





    }*/


}
