// import java.util.Scanner;

// public class Base {
//     Scanner sc = new Scanner(System.in);
//     int phy, chem;

//     Base() {
//         System.out.println("Enter the marks of physics : ");
//         phy = sc.nextInt();
//         System.out.println("Enter the marks of chemistry : ");
//         chem = sc.nextInt();
//     }

//     public static void main(String args[]) {
//         DER obj = new DER();
//     }
// }

// class DER extends Base {
//     DER() {
//         System.out.println("Sum of marks : " + (phy + chem));
//     }
// }
import java.util.*;

public class Base {
    Scanner input = new Scanner(System.in);
    static int phy;
    static int chem;

    public static void main(String[] args) {
        DER obj = new DER();
        obj.takeinput();
        obj.PerformSum(phy, chem);

    }

    void takeinput() {
        phy = input.nextInt();
        chem = input.nextInt();
    }
}

class DER extends Base {
    public void PerformSum(int a, int b) {
        System.out.println("Sum" + (a + b));
    }
}