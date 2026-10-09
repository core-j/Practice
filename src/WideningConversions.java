public class WideningConversions {
    public static void main(String[] args) {
        byte b = 100;
        short s = b;          // byte → short
        int i = s;            // short → int
        long l = i;           // int → long
        float f = l;          // long → float
        double d = f;         // float → double
        System.out.println("byte→short→int→long→float→double: " + d);

        char c = 'A';         // Unicode 65
        int ci = c;           // char → int
        long cl = ci;         // int → long
        float cf = cl;        // long → float
        double cd = cf;       // float → double
        System.out.println("char→int→long→float→double: " + cd);
    }
}
