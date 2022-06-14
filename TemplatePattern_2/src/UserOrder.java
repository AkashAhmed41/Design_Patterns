public class UserOrder extends OrderProcessTemplate{
    @Override
    public void doSelect() {
        System.out.println("Selecting item & adding to cart.");
        System.out.println("Gift wrapper needed or not?");
        System.out.println("Giving my address to deliver the selected item...");
    }

    @Override
    public void doPayment() {
        System.out.println("Paying my bill online through Mobile banking, Card or Paytm...");
    }

    @Override
    public void doDelivery() {
        System.out.println("Telling the Shopkeeper to ship the selected item to post to deliver.");
    }
}
