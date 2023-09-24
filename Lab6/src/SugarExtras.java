class SugarExtras implements ExtrasStrategy {
    @Override
    public String getExtras() {
        return "Sugar";
    }

    @Override
    public double getPrice() {
        return 0.5;
    }
}
