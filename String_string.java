public class String_string {
    public static void main(String args[]) {
        String s1 = "SGGS IT DEPARTMENT JAVA PROGRAMMING";
        String[] words = s1.split("\\s");
        System.out.println();
        for (String w : words) {
            System.out.println(w);
            System.out.println();
        }
        System.out.println();
    }
}
