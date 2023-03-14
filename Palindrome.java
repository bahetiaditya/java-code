import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]) {
        System.out.println("Enter the number : ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int temp = a, rem = 0, rev = 0;
        while (temp > 0) {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        if (a == rev) {
            System.out.println("Entered number is Palindrome !");
        } else {
            System.out.println("Entered number is not Palindrome !");
        }
        input.close();
    }
}
