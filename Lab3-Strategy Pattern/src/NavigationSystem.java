import java.util.List;

// NavigationSystem.java
public class NavigationSystem {
    private RouteCalculationStrategy routeCalculationStrategy;

    public void setRouteCalculationStrategy(RouteCalculationStrategy routeCalculationStrategy) {
        this.routeCalculationStrategy = routeCalculationStrategy;
    }

    public List<String> calculateRoute(String startPoint, String endPoint) {
        return routeCalculationStrategy.calculateRoute(startPoint, endPoint);
    }
}

