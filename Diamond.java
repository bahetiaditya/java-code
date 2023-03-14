import java.util.Scanner;

public class Diamond {
    public static void main(String args[]) {
        System.out.println("Enter the number of lines : ");
        Scanner input = new Scanner(System.in);
        int lines = input.nextInt();
        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= lines - i; j++) {
                System.out.print(" ");
            }
            int stars = 2 * (i - 1);
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = lines; i >= 1; i--) {
            for (int j = 1; j <= lines - i; j++) {
                System.out.print(" ");
            }
            int stars = 2 * (i - 1);
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        input.close();
    }
}
