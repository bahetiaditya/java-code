import java.util.Scanner;

public class Fibonacci {
    public static void Fibonacci_Series(int a) {
        int a1 = 0;
        int a2 = 1;
        int fibo = 0;
        System.out.println("Fibonacci series is : ");
        System.out.print(a1 + " " + a2 + " ");
        for (int i = a2; i <= a; i++) {
            fibo = a1 + a2;
            a1 = a2;
            a2 = fibo;
            System.out.print(fibo + " ");
        }
    }

    public static void main(String args[]) {
        System.out.println("Enter the number  : ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        Fibonacci_Series(a);
        input.close();
    }
}
