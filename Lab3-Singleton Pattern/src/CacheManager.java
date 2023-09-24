import java.util.ArrayList;
import java.util.List;
class CacheManager {
    private static volatile CacheManager instance;
    private List<CacheNode> cacheNodes;

    private CacheManager() {
        cacheNodes = new ArrayList<>();
    }

    public static CacheManager getInstance() {
        if (instance == null) {
            synchronized (CacheManager.class) {
                if (instance == null) {
                    instance = new CacheManager();
                }
            }
        }
        return instance;
    }

    public void addCacheNode(CacheNode node) {
        cacheNodes.add(node);
        System.out.println("Added cache node: " + node.getName());
    }

    public void removeCacheNode(CacheNode node) {
        cacheNodes.remove(node);
        System.out.println("Removed cache node: " + node.getName());
    }

    public void printCacheNodes() {
        System.out.println("Current cache nodes:");
        for (CacheNode node : cacheNodes) {
            System.out.println(node.getName());
        }
    }
}
