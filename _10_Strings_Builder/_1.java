package _10_Strings_Builder;

import java.sql.SQLOutput;

public class _1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("yooo");
        System.out.println(sb);


        //char at index 0
        System.out.println(sb.charAt(0));

        // set char  at index
        sb.setCharAt(0,'p');
        System.out.println(sb);
    }
}
