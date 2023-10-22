public class Village {
    private House house;
    private Tree tree;
    private WaterSource waterSource;

    public Village(House house, Tree tree, WaterSource waterSource) {
        this.house = house;
        this.tree = tree;
        this.waterSource = waterSource;
    }

    public void describe() {
        System.out.println("This village consists of a " + house.getType() +
                ", a " + tree.getType() + ", and a " + waterSource.getType() + ".");
    }
}
