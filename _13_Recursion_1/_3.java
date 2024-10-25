package _13_Recursion_1;

// 1st and laste occurance of an element in string
public class _3 {
    public static int first = -1;
    public static int last = -1;

    public static void find00ccurance(String str, int idx, char element) {
        if (idx == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;

        }

        char currChar = str.charAt(idx);
        if (currChar == element) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }
        find00ccurance(str, idx + 1, element);

    }

    public static void main(String[] args) {
        String str = "abaacdaefaah";
        find00ccurance(str, 0, 'a');
    }
}

