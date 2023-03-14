import java.util.*;

public class Square_pattern {
    public static void main(String args[]) {
        System.out.println("Enter the number of rows : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        input.close();
    }
}
