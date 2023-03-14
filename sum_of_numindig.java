import java.util.Scanner;

public class sum_of_numindig {

    static int sum = 0, rem;

    public static int sum_dig_num(int a) {
        sum = sum + (a % 10);
        rem = a / 10;
        if (rem > 0) {
            sum_dig_num(rem);
        }
        return sum;
    }

    public static void main(String args[]) {
        System.out.println("Enter the number : ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int result = sum_dig_num(a);
        System.out.println("Sum of digits is : " + result);
        input.close();
    }
}
