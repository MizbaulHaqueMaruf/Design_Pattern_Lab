// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Create a coffee factory
        CoffeeFactory coffeeFactory = new CoffeeFactory();

        // Place an order for a medium cappuccino with milk and sugar extras for in-store pickup
        Coffee cappuccino = coffeeFactory.createCoffee("cappuccino");
        cappuccino = new ExtraExtrasDecorator(cappuccino, new MilkExtras());
        cappuccino = new ExtraExtrasDecorator(cappuccino, new SugarExtras());
        cappuccino = new ExtraExtrasDecorator(cappuccino, new SugarExtras());
        PickupStrategy inStorePickup = new InStorePickup();

        // Display the order details and pickup method
        System.out.println("Order Details:");
        System.out.println("Coffee: " + cappuccino.getDescription());
        System.out.println("Price: $" + cappuccino.getPrice());
        inStorePickup.performPickup();

        // Place an order for a small latte with extra milk for delivery
        Coffee latte = coffeeFactory.createCoffee("latte");
        latte = new ExtraExtrasDecorator(latte, new MilkExtras());
        PickupStrategy deliveryPickup = new DeliveryPickup();

        // Display the order details and pickup method
        System.out.println("\nOrder Details:");
        System.out.println("Coffee: " + latte.getDescription());
        System.out.println("Price: $" + latte.getPrice());
        deliveryPickup.performPickup();
    }
}