class InStorePickup implements PickupStrategy {
    @Override
    public void performPickup() {
        System.out.println("Order is ready for in-store pickup.");
    }
}
