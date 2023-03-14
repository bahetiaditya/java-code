import java.util.Scanner;

public class MethodOverloading {
    public static double area(int radius) {
        return Math.PI * radius * radius;
    }

    public static double area(int base, int height) {
        return (0.5 * base * height);
    }

    public static void main(String args[]) {
        System.out.println("Enter the radius of the circle : ");
        Scanner input = new Scanner(System.in);
        int radius = input.nextInt();
        System.out.println("Enter the base of the triangle : ");
        int base = input.nextInt();
        System.out.println("Enter the height of the triangle : ");
        int height = input.nextInt();
        double area_triangle = area(base, height);
        double area_circle = area(radius);
        System.out.println("Area of triangle is : " + area_triangle);
        System.out.println("Area of circle is : " + area_circle);
        input.close();
    }
}
