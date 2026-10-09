public class AutoBoxingUnboxing {
    public static void main(String[] args) {
        // AutoBoxing: primitive → wrapper
        int primitiveInt = 42;
        Integer boxedInt = primitiveInt; // auto boxing
        System.out.println("AutoBoxing int→Integer: " + boxedInt);

        // Unboxing: wrapper → primitive
        Integer wrapperInt = Integer.valueOf(100);
        int unboxedInt = wrapperInt; // auto unboxing
        System.out.println("Unboxing Integer→int: " + unboxedInt);

        // Works seamlessly in collections
        java.util.List<Integer> list = new java.util.ArrayList<>();
        list.add(primitiveInt); // auto boxing
        int value = list.get(0); // auto unboxing
        System.out.println("List value: " + value);
    }
}
