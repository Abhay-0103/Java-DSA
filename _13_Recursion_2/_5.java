package _13_Recursion_2;

// print all the subsets of a set of first n numbers

import java.util.ArrayList;

public class _5 {
    public static void printsubset(ArrayList<Integer> subset) {
        for (int i=-0; i<subset.size(); i++) {
            System.out.println(subset.get(i)+" ");
        }
        System.out.println();
    }
    public static void findsubsets(int n, ArrayList<Integer> subset) {
        if (n == 0) {
            printsubset(subset);
            return;
        }
        // add hoga
        subset.add(n);
        findsubsets(n-1, subset);

        //add nahi hoga
        subset.remove(subset.size()-1);
        findsubsets(n-1, subset);

    }
    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        findsubsets(n, subset);
    }

}
