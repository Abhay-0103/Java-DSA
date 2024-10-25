package _25_HashSet;
import java.util.HashSet;
import java.util.Iterator;


public class _1 {
    public static void main(String[] args) {
        // creating a hashset
        HashSet<Integer> set = new HashSet<>();
        // ArrayList<Integer> list = new Arraylist
        // sane as arraylist only diff is putting hashset

        // Insert
        set.add(1); // list.add(element) same only diff set
        set.add(2);
        set.add(3);
        set.add(1);

//        // Search in hash is called as contains
//        if (set.contains(1)) {
//            System.out.println("set contains 1");
//        }
//        if (!set.contains(6)) {
//            System.out.println("does not contains");
//        }
//
//        // deleteing
//        set.remove(1);
//        if (!set.contains(1)) {
//            System.out.println("does not contains 1 - we deleted 1");
//        }

         // for size this do not allow dulicate's
        System.out.println("size of set is : " + set.size());

        // for printn all element even dulicate also
        // for print of all set we have to remove other commands
        System.out.println(set);

        //Iterator
        Iterator it = set.iterator();

        // hasNext : next
        while (it.hasNext()) {
            System.out.println(it.next());

        }
    }
}
