// import java.util.HashMap;

// public class Main {
// public static void main(String[] args) {
// String str = "abcdefghijklmnopqrstuvwxyz";
// HashMap<Character, Integer> frequencyMap = new HashMap<>();
// char[] charArray = str.toCharArray();
// for (char c : charArray) {
// if (frequencyMap.containsKey(c)) {
// frequencyMap.put(c, frequencyMap.get(c) + 1);
// } else {
// frequencyMap.put(c, 1);
// }
// }
// for (char c : frequencyMap.keySet()) {
// if (frequencyMap.get(c) > 1) {
// System.out.println("Duplicate character: " + c);
// }
// }
// }
// }
// import java.util.HashSet;

// public class Main {
// public static void main(String[] args) {
// String str = "aditya";
// HashSet<Character> set = new HashSet<>();
// for (int i = 0; i < str.length(); i++) {
// char c = str.charAt(i);
// if (!set.add(c)) {
// System.out.println("Duplicate character: " + c);
// }
// }
// }
// }
// public class Main {
// public static void main(String[] args) {
// String str = "racecar";
// int length = str.length();
// for (int i = 0; i < length / 2; i++) {
// if (str.charAt(i) != str.charAt(length - i - 1)) {
// System.out.println("Not a palindrome");
// return;
// }
// }
// System.out.println("Palindrome");
// }
// }
// public class Main {
// public static void main(String[] args) {
// String str = "racecar";
// String reversed = new StringBuilder(str).reverse().toString();
// if (str.equals(reversed)) {
// System.out.println("Palindrome");
// } else {
// System.out.println("Not a palindrome");
// }
// }
// }
// public class Main {
// public static void main(String[] args) {
// char c = 'A';
// int asciiValue = (int) c;
// System.out.println("ASCII value of " + c + " is: " + asciiValue);
// }
// }
// public class Main {
// public static void main(String[] args) {
// char c = 'A';
// int asciiValue = Character.codePointAt(new char[] { c }, 0);
// System.out.println("ASCII value of " + c + " is: " + asciiValue);
// }
// }
