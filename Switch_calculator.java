import java.util.*;

public class Switch_calculator {
    public static void main(String args[]) {
        System.out.println("Enter the num 1 : ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println("Enter the number 2 : ");
        int b = input.nextInt();
        System.out.println("Enter the operation you want to perform : ");
        char c = input.next().charAt(0);
        switch (c) {
            case '+':
                System.out.println("Addition of " + a + " and " + b + " is : " + (a + b));
                break;
            case '-':
                System.out.println("Subtraction of " + a + " and " + b + " is : " + (a - b));
                break;
            case '*':
                System.out.println("Multiplication of " + a + " and " + b + " is : " + (a * b));
                break;
            case '/':
                System.out.println("Division of " + a + " and " + b + " is : " + (a / b));
                break;
            case '%':
                System.out.println("Remainder of " + a + " and " + b + " is : " + (a % b));
                break;
            default:
                System.out.println("Enter the valid choice !");
                break;
        }
        input.close();
    }
}
