
import java.util.*;

public class Swap_withoutthirs {
    public static void swapping_number(int a, int b) {
        a = a - b;
        b = a + b;
        a = b - a;
        System.out.println("after swapping a : " + a + " b and " + b);
    }

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number- ");
        int a = sc.nextInt();
        System.out.print("Enter second number- ");
        int b = sc.nextInt();
        System.out.println("before swapping a : " + a + " b and " + b);
        swapping_number(a, b);
        sc.close();
    }
}
