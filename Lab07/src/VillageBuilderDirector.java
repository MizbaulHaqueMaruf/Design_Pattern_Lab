public class VillageBuilderDirector {
    private HouseBuilder houseBuilder;
    private TreeBuilder treeBuilder;
    private WaterSourceBuilder waterSourceBuilder;

    public VillageBuilderDirector() {
        houseBuilder = new HouseBuilder();
        treeBuilder = new TreeBuilder();
        waterSourceBuilder = new WaterSourceBuilder();
    }

    public Village buildVillage(String houseType, String treeType, String waterSourceType) {
        House house = houseBuilder.setType(houseType).build();
        Tree tree = treeBuilder.setType(treeType).build();
        WaterSource waterSource = waterSourceBuilder.setType(waterSourceType).build();

        return new Village(house, tree, waterSource);
    }
}
