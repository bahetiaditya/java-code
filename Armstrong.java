import java.util.Scanner;

public class Armstrong {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = input.nextInt();
        int temp = num, r = 0, arm = 0;
        while (temp > 0) {
            r = temp % 10;

            arm = (int) Math.pow(r, 3) + arm;
            temp = temp / 10;
        }
        if (arm == num) {
            System.out.println(num + " is a Armstrong number !");
        } else {
            System.out.println(num + " is not an Armstrong number !");
        }
        input.close();
    }
}
