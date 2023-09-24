import java.util.Arrays;
import java.util.List;

public class AStarRouteStrategy implements RouteCalculationStrategy {
    @Override
    public List<String> calculateRoute(String startPoint, String endPoint) {
        System.out.println("Calculating route using A* algorithm...");
        return Arrays.asList("A", "C", "E", "D");
    }
}
