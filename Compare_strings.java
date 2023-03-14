import java.util.Scanner;

public class Compare_strings {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string 1 : ");
        String s1 = sc.nextLine();
        System.out.println("Enter string 2 : ");
        String s2 = sc.nextLine();
        if (s1.compareTo(s2) != 0) {
            System.out.println("Strings are not equal!");
        } else {
            System.out.println("Strings are equal");
        }
        sc.close();
    }
}