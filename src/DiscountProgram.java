public class DiscountProgram {
    public static void main(String[] args) {
        int orderAmount = 7500;
        if (orderAmount >= 10000) {
            System.out.println("20% discount");
        } else if (orderAmount >= 5000) {
            System.out.println("10% discount");
        } else {
            System.out.println("No discount");
        }
    }
}
