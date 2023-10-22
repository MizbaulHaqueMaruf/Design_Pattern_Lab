public class WaterSourceBuilder {
    private String type;

    public WaterSourceBuilder setType(String type) {
        this.type = type;
        return this;
    }

    public WaterSource build() {
        return new WaterSource(type);
    }
}
