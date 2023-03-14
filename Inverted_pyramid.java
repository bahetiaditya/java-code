import java.util.*;

public class Inverted_pyramid {
    public static void main(String args[]) {
        System.out.println("Enter the number of lines : ");
        Scanner input = new Scanner(System.in);
        int lines = input.nextInt();
        for (int i = 1; i <= lines; i++) {
            for (int j = lines; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        input.close();
    }
}
