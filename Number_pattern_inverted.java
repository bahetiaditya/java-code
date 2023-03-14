import java.util.*;

public class Number_pattern_inverted {
    public static void main(String args[]) {
        System.out.println("Enter the number till print : ");
        Scanner input = new Scanner(System.in);
        int lines = input.nextInt();
        int number = 1;
        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= lines - i + 1; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
        input.close();
    }
}
