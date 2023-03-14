import java.util.Scanner;

public class Count_numbers {

    public static void Count_Numbers(int n) {
        int[] arr = new int[n];
        int pcount = 0, ncount = 0, zcount = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                pcount++;
            } else if (arr[i] < 0) {
                ncount++;
            } else {
                zcount++;
            }
        }
        System.out.println("LESS THAN 0 : " + ncount);
        System.out.println("GREATER THAN 0 : " + pcount);
        System.out.println("EQUAL TO 0 : " + zcount);
        input.close();
    }

    public static void main(String args[]) {
        System.out.println("Enter the number of input to give : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the numbers : ");
        System.out.println();
        Count_Numbers(n);
        sc.close();

    }
}
