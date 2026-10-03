public class RepeatedSubstringPattern {
    public static boolean repeatedSubstringPattern(String s) {
        String doubled = s + s;
        // take substring excluding first and last char
        String sub = doubled.substring(1, doubled.length() - 1);
        return sub.contains(s);
    }

    public static void main(String[] args) {
        System.out.println(repeatedSubstringPattern("abab")); // true
        System.out.println(repeatedSubstringPattern("aba"));  // false
        System.out.println(repeatedSubstringPattern("abcabcabcabc")); // true
    }
}
