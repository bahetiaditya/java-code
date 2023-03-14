import java.util.*;

public class factorial {
    public static void factorial_of_number(int a) {
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of numebr is  : " + fact);
    }

    public static int factorialof_number(int a) {

        if (a > 0) {
            return (a * factorialof_number(a - 1));
        }
        return 1;
    }

    public static void main(String args[]) {
        System.out.println("Enter the number : ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        factorial_of_number(a);
        int b = factorialof_number(a);
        System.out.println("Factorial of number is : " + b);
        input.close();
    }
}
