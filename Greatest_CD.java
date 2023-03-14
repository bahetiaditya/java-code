import java.util.Scanner;

public class Greatest_CD {
    public static void GCD_calculate(int a, int b) {
        int temp = 0;
        if (a > b) {
            for (int i = 1; i <= a; i++) {
                if (a % i == 0 && b % i == 0) {
                    temp = i;
                }
            }
        } else {
            for (int i = 1; i <= b; i++) {
                if (a % i == 0 && b % i == 0) {
                    temp = i;
                }
            }
        }
        System.out.println("GCD of " + a + " and " + b + " is : " + temp);
    }

    public static void main(String args[]) {
        System.out.println("Enter the number 1 : ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println("Enter the number 2: ");
        int b = input.nextInt();
        GCD_calculate(a, b);
        input.close();
    }
}
