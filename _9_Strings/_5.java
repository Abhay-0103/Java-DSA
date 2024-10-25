package _9_Strings;

public class _5 {
    public static void main(String[] args) {
        // compare
        String name1 = "lucky";
        String name2 = "lucky";

        //1 s1>s2 : +ve value
        //2 s1==s2 : 0
        //3 s1<s2 : -ve value

        // ex :- 1st.hello    2nd.cello
        if (name1.compareTo(name2) == 0) {
            System.out.println("String are equal");
        }
        else {
           System.out.println("String are not equal");


           // we can use == but at some case it  fails so
            // we use compareto function

//            if (name1 == name2) {
//                System.out.println("String are equal");
//            }
//            else {
//                System.out.println("String are not equal");



            // ex:- that it can be worng
//            if (new String("lucky") == new String("lucky")) {
//                System.out.println("is equal");
//            } else {
//                System.out.println("not equAL");
            }
        }
    }

