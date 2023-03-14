import java.util.Scanner;

public class Reverse_num {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = input.nextInt();
            int reverse = 0;
            while (num > 0) {
                reverse = reverse * 10 + num % 10;
                num = num / 10;
            }
        System.out.println("Reverse of number inputed is : " + reverse);
        input.close();
    }
}
