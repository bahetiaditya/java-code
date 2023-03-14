import java.util.Scanner;

public class ASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        for (int i = 0; i < str.length(); i++) {
            int asciiValue = (int) str.charAt(i);
            System.out.println("ASCII value of " + str.charAt(i) + " is: " + asciiValue);
        }

        sc.close();
    }
}