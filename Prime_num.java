import java.util.Scanner;

public class Prime_num {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int a = input.nextInt();
        int count = 0;
        for (int i = 2; i <= a; i++) {
            if (a % i == 0) {
                count++;
            }
        }
        if (count >= 2) {
            System.out.println(a + " is not a prime number");
        } else {
            System.out.println(a + " is a prime number !");
        }
        input.close();
    }
}
