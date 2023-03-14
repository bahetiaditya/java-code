import java.util.Scanner;

public class Sum_matrix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int row, col;
        System.out.println("Enter the size of row of matrix : ");
        row = sc.nextInt();
        System.out.println("Enter the size of col of matrix : ");
        col = sc.nextInt();
        int mat1[][] = new int[row][col];
        int mat2[][] = new int[row][col];
        int sum[][] = new int[row][col];
        System.out.println("Enter the elements of matrix 1 : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the elements of matrix 2 : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        System.out.println("Sum of matrix is : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(sum[i][j] + "\t");

            }
            System.out.println();
        }
        sc.close();
    }
}
