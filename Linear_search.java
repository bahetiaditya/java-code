import java.util.Scanner;

public class Linear_search {
    public static void Linear(int arr[], int key, int n) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                System.out.println("Number found at index number : " + (i + 1));
                return;
            }
        }
        System.out.println("Entered element is not found !");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Entered elements of the array are : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Enter the key : ");
        int key = sc.nextInt();
        Linear(arr, key, n);

        sc.close();
    }
}
