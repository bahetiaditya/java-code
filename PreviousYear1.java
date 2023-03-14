
import java.util.*;

public class PreviousYear1 {
    public static void Display_grades(int marks[], int n) {
        for (int i = 0; i < n; i++) {
            if (marks[i] < 100 && marks[i] > 90) {
                System.out.println("Grade is AA for sub " + (i + 1));
            } else if (marks[i] < 91 && marks[i] > 80) {
                System.out.println("Grades is AB for sub " + (i + 1));
            } else if (marks[i] < 81 && marks[i] > 70) {
                System.out.println("Grades is BB for sub " + (i + 1));
            } else if (marks[i] < 71 && marks[i] > 60) {
                System.out.println("Grades is BC for sub " + (i + 1));
            } else if (marks[i] < 61 && marks[i] > 50) {
                System.out.println("Grades is CD for sub " + (i + 1));
            } else if (marks[i] < 51 && marks[i] > 40) {
                System.out.println("Grades is DD for sub " + (i + 1));
            } else if (marks[i] >= 00 && marks[i] <= 40) {
                System.out.println("Grades is FAIL for sub " + (i + 1));
            } else {
                System.out.println("Enter the valid marks !");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subjects : ");
        int n = sc.nextInt();
        int[] marks = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the marks of sub " + (i + 1));
            marks[i] = sc.nextInt();
        }
        Display_grades(marks, n);
        sc.close();
    }
}
