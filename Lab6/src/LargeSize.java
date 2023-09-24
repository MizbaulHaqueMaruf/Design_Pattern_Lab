class LargeSize implements SizeStrategy {
    @Override
    public String getSize() {
        return "Large";
    }

    @Override
    public double getPrice() {
        return 4.0;
    }
}
