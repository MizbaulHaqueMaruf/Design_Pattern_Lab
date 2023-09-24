import java.util.Arrays;
import java.util.List;

public class FloydWarshallRouteStrategy implements RouteCalculationStrategy {
    @Override
    public List<String> calculateRoute(String startPoint, String endPoint) {
        System.out.println("Calculating route using Floyd-Warshall algorithm...");
        return Arrays.asList("A", "B", "E", "D");
    }
}
