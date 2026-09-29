public class SimpleIndexProblem {
    public static void main(String[] args) {

        // Declare and initialize a String variable
        String employeeName = "Chaithanya";

        // Print the original string
        System.out.println(employeeName);

        // Find the index position of character 't' in the string
        System.out.println(employeeName.indexOf('t'));

        // Retrieve the character at index 5 (zero-based indexing)
        System.out.println(employeeName.charAt(5));

        // Convert the string to uppercase
        System.out.println(employeeName.toUpperCase());

        // Convert the string to lowercase
        System.out.println(employeeName.toLowerCase());

        // Print the total length of the string
        System.out.println(employeeName.length());
    }
}
