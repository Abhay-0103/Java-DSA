package _10_Strings_Builder;

public class _3 {
    public static void main(String[] args) {

        // append is also called add in the end
        StringBuilder sb = new StringBuilder("h");
        sb.append("e"); // if we was writing in string
        sb.append("l"); // we can write str= str + "e";
        sb.append("l"); // str =str + "l";
        sb.append("o"); // str = str + "o";
        System.out.println(sb.length());

    }
}
