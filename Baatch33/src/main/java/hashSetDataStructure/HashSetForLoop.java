package hashSetDataStructure;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetForLoop {

    public static ArrayList<String> hashSetForLoop(HashSet hs) {
        ArrayList<String> al = new ArrayList<>();
        String[] p = new String[hs.size()];
        hs.toArray(p);
        for (int i = 0; i < p.length; i++) {
            al.add(p[i]);

        }
        return al;
    }

    /*public static void main(String[] args){
        HashSetForLoop h = new HashSetForLoop();
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

        h.hashSetForLoop(hs);





    }*/
}



