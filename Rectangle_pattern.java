import java.util.Scanner;

public class Rectangle_pattern {
    public static void main(String args[]) {
        System.out.println("Enter the length : ");
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        System.out.println("Enter breadth");
        int breadth = input.nextInt();
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= breadth; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        input.close();
    }
}
