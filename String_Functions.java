public class String_Functions {
    public static void main(String args[]) {
        String s1 = "Java Programming", s2 = "", s3 = "";
        System.out.println();
        System.out.println("Length of string " + s1 + " is : " + s1.length());
        System.out.println("String at present : " + s1 + s2 + s3);
        System.out.println();
        s2 = s2.replace("", " Is");
        s3 = s3.replace("", " Fun");
        System.out.println("After replacement : " + s1 + s2 + s3);
        System.out.println();
        s3 = s3.concat(" Is Fun ");
        System.out.println(s1 + s3);
        System.out.println();
    }
}
