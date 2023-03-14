public class PreviousYear3 {
    public void printValues(int num, char ch) {
        System.out.println("Integer: " + num + ", Character: " + ch);
    }

    public void printValues(char ch, int num) {
        System.out.println("Character: " + ch + ", Integer: " + num);
    }

    public static void main(String[] args) {
        PreviousYear3 pic = new PreviousYear3();

        pic.printValues(42, 'A');
        pic.printValues('B', 73);
    }
}
