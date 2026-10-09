public class AutoBoxingPitfalls {
    public static void main(String[] args) {
        Integer a = 128;
        Integer b = 128;
        System.out.println("a == b ? " + (a == b)); // false (different objects)
        System.out.println("a.equals(b) ? " + a.equals(b)); // true (value equal)

        Integer c = null;
        // int d = c; // NullPointerException during unboxing
    }
}
