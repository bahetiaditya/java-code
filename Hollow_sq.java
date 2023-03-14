import java.util.*;

public class Hollow_sq {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of stars in a row : ");
        int stars = input.nextInt();
        for (int i = 1; i <= stars; i++) {
            for (int j = 1; j <= stars; j++) {
                if (i == 1 || i == stars || j == 1 || j == stars) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        input.close();
    }
}
