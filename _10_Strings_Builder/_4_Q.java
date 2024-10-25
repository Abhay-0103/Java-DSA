package _10_Strings_Builder;

public class _4_Q {
    // revers
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");

        for (int i = 0; i < sb.length()/2; i++) {
            int front = i;
            int back = sb.length() - 1 - i; // 5-1-0 =>4

            char frontchar = sb.charAt(front);
            char backchar = sb.charAt(back);

            sb.setCharAt(front, backchar);
            sb.setCharAt(back, frontchar);
        }
        System.out.println(sb);
    }
}
