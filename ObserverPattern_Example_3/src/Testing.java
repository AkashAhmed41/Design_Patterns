public class Testing {
    public static void main(String[] args) {
        Seller seller = new Seller();
        Buyer buyer = new Buyer();
        Warehouse warehouse = new Warehouse();
        DeliveryData deliveryData = new DeliveryData();

        deliveryData.registerObserver(warehouse);
        deliveryData.registerObserver(buyer);
        deliveryData.registerObserver(seller);

        deliveryData.locationChanged();
        System.out.println();
        deliveryData.unregisterObserver(warehouse);
        deliveryData.locationChanged();
        System.out.println();
        deliveryData.unregisterObserver(buyer);
        deliveryData.locationChanged();
    }
}
