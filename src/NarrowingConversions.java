public class NarrowingConversions {
    public static void main(String[] args) {
        double d = 12345.6789;
        float f = (float) d;   // double → float (precision loss)
        long l = (long) f;     // float → long (fraction lost)
        int i = (int) l;       // long → int (possible overflow)
        short s = (short) i;   // int → short (overflow risk)
        byte b = (byte) s;     // short → byte (overflow risk)
        System.out.println("double→float→long→int→short→byte: " + b);
    }
}
