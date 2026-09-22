public class StringOperations { // Demonstrates basic String operations in Java

    public static void main(String[] args){
        String employeeName="Chaithanya";  // Declare and initialize a String variable
        System.out.println(employeeName);  // Print the original string
        System.out.println(employeeName.indexOf('t')); // Find the index position of character 't' in the string
        System.out.println(employeeName.charAt(5)); // Retrieve the character at index 5 (zero-based indexing)
        System.out.println(employeeName.toUpperCase());  // Convert the string to uppercase
        System.out.println(employeeName.toLowerCase());  // Convert the string to lowercase
        System.out.println(employeeName.length());  // Print the total length of the string

    }
}
