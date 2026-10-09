public class TypeChecking {
    public static void main(String[] args) {
        Object obj = "Hello";
        System.out.println(obj);
        // instanceof checks type at runtime
        if (obj instanceof String) {
            System.out.println("obj is a String");
        }
        // Compile-time type safety
        // int x = "abc"; // ERROR: incompatible types
    }
}
