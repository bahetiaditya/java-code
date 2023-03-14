public class PreviousYear2 {
    String name;
    int roll_no;

    public void Displaydata(String Name, int rollno) {
        this.name = Name;
        this.roll_no = rollno;
        System.out.println("Name : " + name);
        System.out.println("Roll number : " + roll_no);
    }

    public static void main(String[] args) {
        PreviousYear2 obj1 = new PreviousYear2();
        obj1.Displaydata("John", 2);
    }
}