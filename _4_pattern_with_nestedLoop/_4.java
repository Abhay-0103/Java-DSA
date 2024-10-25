package _4_pattern_with_nestedLoop;

public class _4 {
    public static void main(String[] args) {
         int n = 4;
         // outer loop
        for (int i =n; i>=1; i--)  {
            // inner loop
            for (int j =1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//****
//***
//**
//*