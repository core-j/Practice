public class SpecialCases {
    public static void main(String[] args) {
        // Integer overflow
        int max = Integer.MAX_VALUE;
        System.out.println("Overflow wrap: " + (max + 1));

        // Floating-point approximation
        double sum = 0.1 + 0.2;
        System.out.println("0.1 + 0.2 = " + sum);
        System.out.println("Equal to 0.3? " + (sum == 0.3));

        // Char as number
        char c = 'A';
        System.out.println("Char 'A' numeric value: " + (int)c);
    }
}
