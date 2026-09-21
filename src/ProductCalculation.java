public class ProductCalculation {
    public static void main(String[] args){
        int quantity = 5;
        int price = 120;
        int discount = 50;

        int subtotal = quantity * price;
        int finalAmount = subtotal - discount;
        System.out.println("Subtotal:"+subtotal);
        System.out.println("Final Amount:"+finalAmount);
    }
}
