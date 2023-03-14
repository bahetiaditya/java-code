import java.util.Scanner;

class Cons {
    int value;

    // default
    Cons() {
        System.out.println("Constructor called !");
    }

    // Parametarized
    Cons(int num1, int num2) {
        System.out.println("Addition of " + num1 + " and " + num2 + " is " + (num1 + num2));
    }

    // Copy
    Cons(int num) {
        value = num;
        System.out.println("num is : " + value);
    }
}

public class Constructors {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1 : ");
        int a = sc.nextInt();
        System.out.println("Enter the number 2 : ");
        int b = sc.nextInt();
        Cons name = new Cons();
        Cons obj = new Cons(a, b);
        System.out.println("Enter the number for copy constructor : ");
        int num = sc.nextInt();
        Cons obj1 = new Cons(num);
        sc.close();
    }
}
