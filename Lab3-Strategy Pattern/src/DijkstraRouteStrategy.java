import java.util.Arrays;
import java.util.List;

// DijkstraRouteStrategy.java
public class DijkstraRouteStrategy implements RouteCalculationStrategy {
    @Override
    public List<String> calculateRoute(String startPoint, String endPoint) {
        System.out.println("Calculating route using Dijkstra's algorithm...");
        return Arrays.asList("A", "B", "C", "D");
    }
}



