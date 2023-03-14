import java.util.*;

public class Pattern_01 {
    public static void main(String args[]) {
        System.out.println("Enter the number of lines : ");
        Scanner input = new Scanner(System.in);
        int lines = input.nextInt();
        int sum = 0;
        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= i; j++) {
                sum = i + j;
                if (sum % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
        input.close();
    }
}
