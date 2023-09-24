class ExtraExtrasDecorator extends CoffeeDecorator {
    private ExtrasStrategy extras;

    public ExtraExtrasDecorator(Coffee coffee, ExtrasStrategy extras) {
        super(coffee);
        this.extras = extras;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", " + extras.getExtras();
    }

    @Override
    public double getPrice() {
        return coffee.getPrice() + extras.getPrice();
    }
}