package _9_Strings;

public class _4 {
    public static void main(String[] args) {
        String firstname = "lucky";
        String lastname = "bhai";
        String fullname = firstname + " " + lastname;
        System.out.println("total lenght is : ");
        System.out.println(fullname.length());

        // charAt
        // which print 1 letter in 1 line
        for (int i=0; i<fullname.length(); i++) {
            System.out.println(fullname.charAt(i));
        }
    }
}
