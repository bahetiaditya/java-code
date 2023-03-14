
import java.util.Scanner;

public class Duplicate_char_string {
    public static void duplicate(String str) {
        for (int i = 0; i < str.length(); i++) {

            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    System.out.println("Duplicate character : " + str.charAt(i));
                }
            }
        }
    }

    public static void main(String args[]) {
        System.out.println("Enter the string : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        duplicate(str);
        sc.close();
    }
}
