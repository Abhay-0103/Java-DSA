package _10_Strings_Builder;

public class _2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("yoooo!");
        System.out.println(sb);

        // insert
        sb.insert(0, 's');
        System.out.println(sb);

        // insert
        sb.insert(2, 'n' );
        System.out.println(sb);

        // delete the extra 'n'
        sb.delete(2, 3);
        System.out.println(sb);
    }
}
