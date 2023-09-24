class MediumSize implements SizeStrategy {
    @Override
    public String getSize() {
        return "Medium";
    }

    @Override
    public double getPrice() {
        return 3.0;
    }
}
