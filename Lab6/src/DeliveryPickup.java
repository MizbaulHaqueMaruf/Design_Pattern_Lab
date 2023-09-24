class DeliveryPickup implements PickupStrategy {
    @Override
    public void performPickup() {
        System.out.println("Order will be delivered to your address.");
    }
}
