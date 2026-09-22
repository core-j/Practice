public class OperatorOverloading { // Demonstrates operator overloading behavior of '+' in Java
    public static void main(String[] args) {
        String employeeName = "Chaithanya";  // Declare and initialize a String variable
        int a=10, b=90;    // Declare and initialize integer variables
        // '+' performs numeric addition when both operands are numbers
        System.out.println(a+b); // Output: 100
        // '+' performs string concatenation when one operand is a String
        System.out.println(employeeName+"26"); // "Chaithanya26"
        System.out.println(employeeName+"Vulasa"); // "ChaithanyaVulasa"
        System.out.println(employeeName+true); // "Chaithanyatrue"
        System.out.println(employeeName+'V');  // "ChaithanyaV"
        System.out.println(employeeName+"95.5"); // "Chaithanya95.5"

    }
}