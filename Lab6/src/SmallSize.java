class SmallSize implements SizeStrategy {
    @Override
    public String getSize() {
        return "Small";
    }

    @Override
    public double getPrice() {
        return 2.0;
    }
}
