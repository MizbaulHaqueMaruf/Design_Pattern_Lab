public class HouseBuilder {
    private String type;

    public HouseBuilder setType(String type) {
        this.type = type;
        return this;
    }

    public House build() {
        return new House(type);
    }
}
