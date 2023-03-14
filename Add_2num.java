import java.util.Scanner;

public class Add_2num {
    public static void main(String[] args) {
        System.out.println("Enter the number 1 : ");
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        System.out.println("Enter the number 2 : ");
        int x = input.nextInt();
        System.out.println("Addition of 2 numbers is : " + (i + x));
        input.close();
    }
}
