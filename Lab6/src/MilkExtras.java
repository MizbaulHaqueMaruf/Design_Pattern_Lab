class MilkExtras implements ExtrasStrategy {
    @Override
    public String getExtras() {
        return "Milk";
    }

    @Override
    public double getPrice() {
        return 1.0;
    }
}
