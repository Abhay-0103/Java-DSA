package _2_conditions;

import java.util.Scanner;

public class question_2_wt_swtich {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the case");
        int button = sc.nextInt();
        switch(button)  {
            case 1 :
                System.out.println("hello");
                break;
            case 2 :
                System.out.println("namaste");
                break;
            case 3 :
                System.out.println("kya maall hai bidu");
                break;
            default:
                System.out.println("invaide");

        }
    }
}
