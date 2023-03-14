import java.util.Scanner;

public class Lowercase {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String all in upper case : ");
        String s1 = sc.nextLine();
        System.out.println("Entered string as it is : " + s1);
        String s1toLower = s1.toLowerCase();
        System.out.println();
        System.out.println("String after lowercase : " + s1toLower);
        System.out.println();
        sc.close();
    }
}
