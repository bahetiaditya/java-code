import java.util.*;

public class Pyramid {
    public static void main(String args[]) {
        System.out.println("Enter the number of lines : ");
        Scanner input = new Scanner(System.in);
        int lines = input.nextInt();
        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        input.close();
    }
}
