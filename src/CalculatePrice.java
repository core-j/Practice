public class CalculatePrice {
        static int calculatePrice(int price, int quantity) {
            int subtotal = price * quantity;

            if (subtotal >= 1000) {
                subtotal = subtotal - 100;
            }

            return subtotal;
        }

        public static void main(String[] args) {

            int price = 300;
            int quantity = 4;

            int finalPrice = calculatePrice(price, quantity);

            System.out.println(finalPrice);
           // System.out.println(subtotal);
        }
}
