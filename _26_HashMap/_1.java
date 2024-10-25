package _26_HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class _1 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // inserting or adding
        map.put("India", 120);
        map.put("china", 150);
        map.put("usa", 170);

//        System.out.println(map);

//        map.put("china", 180);
//        System.out.println(map);

        // search
//        if (map.containsKey("china")) {
//            System.out.println("key is present in map");
//        } else {
//            System.out.println("key is not present in map");
//        }

        // for geeting the value
//        System.out.println(map.get("china")); // key exits
//        System.out.println(map.get("uk")); // key does not exits
//

        // normal loop
//        int arr[] = {12, 15 ,34};
//        for (int i=0; i<3; i++) {
//            System.out.print(arr[i]+ " ");
//        }
//        System.out.println();


        // for hashing loop
//        for (int val: arr) {
//            System.out.print(val+ " ");
//        }
//        System.out.println();


//        for (int val : arr)
        // for mapping

//        for (Map.Entry<String, Integer> e : map.entrySet()) {
//            System.out.println(e.getKey());
//            System.out.println(e.getValue());
//        }
//
//        Set<String> Keys = map.keySet();
//        for (String key : Keys) {
//            System.out.println(Keys+ " " + map.get(Keys));
//        }

        map.remove("China");
        System.out.println(map);
    }
}