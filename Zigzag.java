import java.util.Scanner;

public class Zigzag {
    public static void main(String args[]) {
        System.out.println("Enter the number of lines : ");
        Scanner input = new Scanner(System.in);
        int lines = input.nextInt();
        for (int i = 1; i <= lines; i++) {
            // spaces
            for (int j = 1; j <= lines - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= lines; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = lines; i >= 1; i--) {
            // spaces
            for (int j = 1; j <= lines - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= lines; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= lines; i++) {
            // spaces
            for (int j = 1; j <= lines - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= lines; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = lines; i >= 1; i--) {
            // spaces
            for (int j = 1; j <= lines - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= lines; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        input.close();
    }
}
