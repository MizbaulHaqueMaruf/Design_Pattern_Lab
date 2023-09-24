class CoffeeFactory {
    public Coffee createCoffee(String type) {
        if (type.equalsIgnoreCase("espresso")) {
            return new Espresso();
        } else if (type.equalsIgnoreCase("cappuccino")) {
            return new Cappuccino();
        } else if (type.equalsIgnoreCase("latte")) {
            return new Latte();
        } else {
            throw new IllegalArgumentException("Invalid coffee type");
        }
    }
}
