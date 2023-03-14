import java.util.Scanner;

public class Palindrome_string {
    public static void main(String[] args) {
        System.out.println("Enter the String : ");
        Scanner input = new Scanner(System.in);
        String str = input.next();
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                System.out.println("Entered String is not a Palindrome");
                return;
            }
            input.close();
        }
        System.out.println("Entered String is Palindrome");

    }
}
