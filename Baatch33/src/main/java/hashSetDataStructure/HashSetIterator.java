package hashSetDataStructure;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetIterator {

    public HashSet<String> hashSetIterator(HashSet hs){
        Iterator<String> iterator = hs.iterator();
        HashSet<String> fruits = new HashSet<>();
        while(iterator.hasNext()){
            String fruit = iterator.next();
            //System.out.println(fruit);
            fruits.add(fruit);
        }
        return fruits;
    }
    /*public static void main(String[] args){
        HashSetIterator h = new HashSetIterator();
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

        h.hashSetIterator(hs);







    }*/


}
