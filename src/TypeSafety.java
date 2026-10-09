public class TypeSafety {
    public static void main(String[] args) {
        boolean flag = true;
        // int result = flag + 1; // ERROR: cannot mix boolean with numbers

        // Generics enforce type safety
        java.util.List<String> list = new java.util.ArrayList<>();
        list.add("Java");
        // list.add(123); // Compile-time error
        System.out.println(list.get(0));
    }
}
