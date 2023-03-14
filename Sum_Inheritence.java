import java.util.Scanner;

class Base {
    int x, y;
    Scanner sc = new Scanner(System.in);

    Base() {
        System.out.println("Enter the number a : ");
        x = sc.nextInt();
        System.out.println("Enter the number b: ");
        y = sc.nextInt();
    }
}

class DER extends Base {
    int sum = x + y;

    DER() {
        // THIS IS CONSTRUCTOR OF FATHER CLASS
    }
}

class Child extends DER {
    Child() {
        super();
        System.out.println("the sum of " + x + " and " + y + " is : " + sum);
    }
}

public class Sum_Inheritence {
    public static void main(String args[]) {
        Child obj1 = new Child();

    }
}
