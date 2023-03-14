import java.util.*;

public class Butterfly_pattern {
    public static void main(String args[]) {
        System.out.println("Enter the number of lines : ");
        Scanner input = new Scanner(System.in);
        int lines = input.nextInt();
        // upper half
        for (int i = 1; i <= lines; i++) {
            // first part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces
            int spaces = 2 * (lines - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            // second part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // lower half
        for (int i = lines; i >= 1; i--) {
            // first part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces
            int spaces = 2 * (lines - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            // second part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        input.close();
    }
}
