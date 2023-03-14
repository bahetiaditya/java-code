import java.util.Scanner;

public class Fibonacci_recursion {
    public static int Fibonacci_recurse(int a) {
        if (a == 0 || a == 1) {
            return a;
        } else {
            return (Fibonacci_recurse(a - 1) + Fibonacci_recurse(a - 2));

        }
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of digits wanted in series : ");
        int a = input.nextInt();
        for (int i = 0; i < a; i++) {
            System.out.print(Fibonacci_recurse(i) + " ");
        }
        input.close();
    }
}
