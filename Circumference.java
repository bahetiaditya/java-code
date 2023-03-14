import java.util.Scanner;

public class Circumference {
    public static double Circumference_of_Circle(double radius) {
        // double Circum;
        // Circum = 2 * Math.PI * radius;
        return (2 * Math.PI * radius);
    }

    public static void main(String args[]) {
        System.out.println("Enter the radius : ");
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        double circum = Circumference_of_Circle(radius);
        System.out.println("Circumference of circle is : " + circum);
        input.close();
    }
}
