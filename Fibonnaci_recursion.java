import java.util.*;

public class Fibonnaci_recursion {
    static int fib(int n) {
        if (n == 1 || n == 2) {
            return (n - 1);
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index of element wanted from fib series : ");
        int x = sc.nextInt();
        int result = fib(x);
        System.out.println("Number on index " + x + " is : " + result);
        sc.close();
    }
}
