import java.util.List;

public interface RouteCalculationStrategy {
    List<String> calculateRoute(String startPoint, String endPoint);
}
