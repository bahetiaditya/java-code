import java.util.*;

public class Conditions {
    public static void main(String args[]) {
        System.out.println("Enter your age : ");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        if (age < 18) {
            System.out.println("You are not an adult");
        } else if (age < 0) {
            System.out.println("Enter the valid age !");
        } else {
            System.out.println("Yout an Adult !");
        }

        input.close();
    }
}
