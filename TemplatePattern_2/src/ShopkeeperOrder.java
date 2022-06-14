public class ShopkeeperOrder extends OrderProcessTemplate{
    @Override
    public void doSelect() {
        System.out.println("Item no.(any int) is selected from the shelf.");
    }

    @Override
    public void doPayment() {
        System.out.println("Payment successful through Paytm(payment method).");
    }

    @Override
    public void doDelivery() {
        System.out.println("Item delivered to customer's address.");
    }
}
