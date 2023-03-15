import java.util.Scanner;

public class Factorial_recursion {
    static int Factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * Factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find factorial of : ");
        int x = sc.nextInt();
        System.out.println("Factorial of " + x + " is " + Factorial(x));
        sc.close();
    }
}
