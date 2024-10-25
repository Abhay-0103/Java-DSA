package _18_arraylist;
import java.util.ArrayList;
import java.util.Collection;


// for evey import
// but it will add evey think which is not neccsery
// so need to imort this impoey key word
import java.util.*;
public class _1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        // add element
        list.add(0);
        list.add(1);
        list.add(23);

        System.out.println(list);

        // get elemet
        int element = list.get(0);
        System.out.println(element);

        // to add in btw
        list.add(2, 2);
        System.out.println(list);

        // set elememtn
        list.set(0,5);
        System.out.println(list);

        // delete element
        list.remove(3);
        System.out.println(list);

        // size
        int size = list.size();
        System.out.println(size);

        //loops
        for (int i=0; i< list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();

        // sort
        Collections.sort(list);
        System.out.println(list);
    }
}
