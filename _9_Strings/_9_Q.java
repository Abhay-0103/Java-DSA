package _9_Strings;

import java.util.Scanner;

public class _9_Q {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email = sc.next();
        String username = "";
        for (int i=0; i<email.length(); i++) {
            if (email.charAt(i) == 'a') {
                break;
            }
            else {
                username += email.charAt(i);
            }
        }
    }
}
