import java.util.*;

public class Palindrome_recursion {
    public static int Palindrome_r(int a, int temp) {
        if (a == 0) {
            return temp;
        } else {
            temp = ((temp * 10) + (a % 10));
        }
        return Palindrome_r((a / 10), temp);
    }

    public static void main(String args[]) {
        System.out.println("Enter the number : ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int temp = Palindrome_r(a, 0);
        if (temp == a) {
            System.out.println("Entered number is Palindrome !");
        } else {
            System.out.println("Entered number is not Palindrome !");
        }
        input.close();
    }
}
