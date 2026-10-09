public class TypeInference {
    public static void main(String[] args) {
        var message = "Hello"; // compiler infers String
        var number = 42;       // compiler infers int
        System.out.println(message + " " + number);
    }
}
