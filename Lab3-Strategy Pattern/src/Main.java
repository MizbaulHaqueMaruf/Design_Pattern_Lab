import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        NavigationSystem navigationSystem = new NavigationSystem();

        RouteCalculationStrategy dijkstraStrategy = new DijkstraRouteStrategy();
        RouteCalculationStrategy aStarStrategy = new AStarRouteStrategy();
        RouteCalculationStrategy bellmanFordStrategy = new BellmanFordRouteStrategy();
        RouteCalculationStrategy floydWarshallStrategy = new FloydWarshallRouteStrategy();

        navigationSystem.setRouteCalculationStrategy(dijkstraStrategy);
        List<String> dijkstraRoute = navigationSystem.calculateRoute("A", "D");
        System.out.println("Dijkstra route: " + dijkstraRoute);

        navigationSystem.setRouteCalculationStrategy(aStarStrategy);
        List<String> aStarRoute = navigationSystem.calculateRoute("A", "D");
        System.out.println("A* route: " + aStarRoute);

        navigationSystem.setRouteCalculationStrategy(bellmanFordStrategy);
        List<String> bellmanFordRoute = navigationSystem.calculateRoute("A", "D");
        System.out.println("Bellman-Ford route: " + bellmanFordRoute);

        navigationSystem.setRouteCalculationStrategy(floydWarshallStrategy);
        List<String> floydWarshallRoute = navigationSystem.calculateRoute("A", "D");
        System.out.println("Floyd-Warshall route: " + floydWarshallRoute);
    }
}