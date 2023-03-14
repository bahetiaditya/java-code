public class Replace_Strings {
    public static void main(String args[]) {
        String s1 = "I AM A SGGSIE&T STUDENT FROM --- DEPARTMENT !";
        System.out.println();
        System.out.println("Before replacement : " + s1);
        String replaceString = s1.replaceAll("---", "IT");
        System.out.println();
        System.out.println("After replacement : " + replaceString);
    }
}
