import java.util.Scanner;

public class Transpose_of_Matrix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows of matrix : ");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns of matrix : ");
        int col = sc.nextInt();
        int mat1[][] = new int[row][col];
        System.out.println("Enter the elements of matrix :");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }
        int transpose[][] = new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = mat1[i][j];
            }
        }
        System.out.println("Transpose of entered matrix is : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(transpose[i][j] + "\t");
            }
            System.out.println();
        }
        sc.close();
    }
}
