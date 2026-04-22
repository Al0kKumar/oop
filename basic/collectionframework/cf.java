package basic.collectionframework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class cf {
    
    public static void main(String[] args) {
        
        // List -> ArrayList, Linkedlist (ordered, duplicate stuff stored)
        // Map -> HashMap (key value pair stored)
        // Set -> HashSet (unique things to be stored)

        ArrayList a = new ArrayList<Integer>();  // like a vector in cpp
        List b = new ArrayList<Integer>();

        List c = new LinkedList<Integer>();
        a.add(1);

        Set<Integer> s = new HashSet<>();


        Map<Integer, String> mp = new HashMap<>();

        System.out.println("okie");

    }
}
