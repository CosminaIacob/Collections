package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        HashMap
//        Collection

        Map map = new HashMap();
        map.put(1, "Cosmina");
        map.put(null, "Iacob");
        map.put(564, "Test");
        map.put(0, "Test");
        map.put("ccc", "Test");

        map.put("ccc", "Test");
        map.put(null, "Iacob2");

        System.out.println(map.put(564, "Test2"));
        System.out.println(map);
        System.out.println(map.get(564));
        System.out.println(map.get(null));

        Iterator iterator = map.entrySet().iterator();


        List<String> arraylist=new ArrayList<>(30);
        Collections.synchronizedList(arraylist);
        System.out.println(arraylist.size());
        System.out.println();

        List<String> arrlst = new ArrayList<String>();
        arrlst.add("tech");
        arrlst.add("beamers");
        arrlst.add("java");
        arrlst.add("python");
        arrlst.add("selenium");
        arrlst.add("shell");
        arrlst.add("shell");

        // Displaying the ArrayList elements
        System.out.println("Before:");
        System.out.println("ArrayList contains: "+arrlst);

        // Creating a LinkedHashSet
        LinkedHashSet<String> linkhs = new LinkedHashSet<String>();

        /* Adding ArrayList elements to the LinkedHashSet
         * in order to remove the duplicate elements and
         * to preserve the insertion order.
         */
        linkhs.addAll(arrlst);

        // Removing the ArrayList elements
        arrlst.clear();

        // Adding the LinkedHashSet elements to the ArrayList
        arrlst.addAll(linkhs);

        // Displaying ArrayList elements
        System.out.println("After:");
        System.out.println("ArrayList contains: "+arrlst);


        final int myVar=4;

//        myVar=9; wrong

        final ArrayList<Integer> arrayList2=new ArrayList<>();
        arrayList2.add(1);
        arrayList2.add(2);

//        arrayList2=new ArrayList<>(); wrong
    }
}
