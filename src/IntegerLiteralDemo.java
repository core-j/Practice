public class IntegerLiteralDemo {
    public static void main(String[] args) {
        // Decimal literal
        int decimal = 1010;

        // Octal literal (prefix 0)
        int octal = 0101; // 65 in decimal

        // Hexadecimal literal (prefix 0x or 0X)
        int hex = 0xA1; // 161 in decimal

        // Binary literal (prefix 0b or 0B)
        int binary = 0b1010; // 10 in decimal

        System.out.println("Decimal: " + decimal);
        System.out.println("Octal: " + octal);
        System.out.println("Hexadecimal: " + hex);
        System.out.println("Binary: " + binary);

        // Validation example
        validateLiteral(0b1010);
        validateLiteral(012);
        validateLiteral(0xFF);
    }

    private static void validateLiteral(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Negative literal not allowed for this context");
        }
        System.out.println("Validated literal: " + value);
    }
}
