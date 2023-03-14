import java.util.*;

public class Number_pattern {
    public static void main(String args[]) {
        System.out.println("Enter the number to print : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int number = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
        input.close();
    }
}
