// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        VillageBuilderDirector villageBuilderDirector = new VillageBuilderDirector();

        // Example 1
        Village village1 = villageBuilderDirector.buildVillage("Brick House", "Mango Tree", "Swimming Pool");
        village1.describe();

        // Example 2
        Village village2 = villageBuilderDirector.buildVillage("Mud House", "Banana Tree", "Pond");
        village2.describe();


//        // Example 1
//        House brickHouse = new HouseBuilder().setType("Brick House").build();
//        Tree mangoTree = new TreeBuilder().setType("Mango Tree").build();
//        WaterSource swimmingPool = new WaterSourceBuilder().setType("Swimming Pool").build();
//
//        Village village1 = new Village(brickHouse, mangoTree, swimmingPool);
//        village1.describe();
//
//        // Example 2
//        House mudHouse = new HouseBuilder().setType("Mud House").build();
//        Tree bananaTree = new TreeBuilder().setType("Banana Tree").build();
//        WaterSource pond = new WaterSourceBuilder().setType("Pond").build();
//
//        Village village2 = new Village(mudHouse, bananaTree, pond);
//        village2.describe();

    }
}