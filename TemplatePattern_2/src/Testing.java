public class Testing {
    public static void main(String[] args) {
        OrderProcessTemplate userOrder1 = new UserOrder();
        OrderProcessTemplate shopkeeperOrder1 = new ShopkeeperOrder();

        userOrder1.processOrder(true);
        System.out.println();
        shopkeeperOrder1.processOrder(true);
        System.out.println();

        OrderProcessTemplate userOrder2 = new UserOrder();
        OrderProcessTemplate shopkeeperOrder2 = new ShopkeeperOrder();

        userOrder2.processOrder(false);
        System.out.println();
        shopkeeperOrder2.processOrder(false);
    }
}
