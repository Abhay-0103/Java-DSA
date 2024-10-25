package _13_Recursion_1;

public class _9 {
    public static String keypad[] = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs",
            "tu", "vwx", "yz"};
    public static void printKeypadCombination(String number, int idx, String res) {
        if(idx == number.length()) {
            System.out.println(res);
            return;
        }

        for(int i=0; i<keypad[number.charAt(idx)-'0'].length(); i++) {
            char curr = keypad[number.charAt(idx)-'0'].charAt(i);
            printKeypadCombination(number, idx+1, res+curr);
        }
    }
    public static void main(String args[]) {
        String number = "23";
        printKeypadCombination(number, 0, "");
    }
}

