import java.util.Scanner;

public class Maximum_number {
    public static void main(String[] args) {
        int max = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");

        int arr[] = new int[11];
        for (int i = 0; i < 10; i++) {
            arr[i] = input.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        for (int i = 0; i < 10; i++) {

            max = Math.max(max, arr[i]);
        }
        System.out.println("Maximum element in the array is : " + max);
        input.close();
    }
}
