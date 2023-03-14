import java.util.Scanner;

public class Swap_thirdvar {
    public static void swap_num(int a, int b) {
        int temp = 0;
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swap a = " + a + " and b is = " + b);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number a : ");
        int a = sc.nextInt();
        System.out.println("Enter the number b : ");
        int b = sc.nextInt();
        System.out.println("Before swap a = " + a + " and b is = " + b);
        swap_num(a, b);
        sc.close();
    }
}