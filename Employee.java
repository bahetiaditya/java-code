import java.util.Scanner;

public class Employee {
    String name, address, phnmbr;
    double exp;
    Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        Programmer obj1 = new Programmer();
        obj1.getdata();
        obj1.writecode();
        System.out.println();
        System.out.println();
        Manager obj2 = new Manager();
        obj2.getdata();
        obj2.reportProjectReport();
    }

    void getdata() {
        System.out.println("Enter the name : ");
        name = sc.next();
        System.out.println("Enter the address : ");
        address = sc.next();
        System.out.println("Enter the mobile number : ");
        phnmbr = sc.next();
        System.out.println("Enter the experience of the employee : ");
        exp = sc.nextDouble();
    }
}

class Programmer extends Employee {
    int programming_languages;

    void writecode() {
        System.out.println("Enter the number of programming languages known by programmer : ");
        programming_languages = sc.nextInt();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Employee name : " + name);
        System.out.println("Address : " + address);
        System.out.println("Mobile Number : " + phnmbr);
        System.out.println("Experience : " + exp);
        System.out.println("Programming languages known : " + programming_languages);
    }
}

class Manager extends Employee {
    int team_size;

    void reportProjectReport() {
        System.out.println("Enter the number of members in team : ");
        team_size = sc.nextInt();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Employee name : " + name);
        System.out.println("Address : " + address);
        System.out.println("Mobile Number : " + phnmbr);
        System.out.println("Experience : " + exp);
        System.out.println("team size : " + team_size);
    }
}