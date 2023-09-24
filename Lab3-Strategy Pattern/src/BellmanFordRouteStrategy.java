import java.util.Arrays;
import java.util.List;

public class BellmanFordRouteStrategy implements RouteCalculationStrategy {
    @Override
    public List<String> calculateRoute(String startPoint, String endPoint) {
        System.out.println("Calculating route using Bellman-Ford algorithm...");
        return Arrays.asList("A", "C", "E", "D");
    }
}
