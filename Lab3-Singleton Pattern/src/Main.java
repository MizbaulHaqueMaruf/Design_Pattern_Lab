// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        CacheManager cacheManager = CacheManager.getInstance();

        CacheNode localCache = new CacheNode("LocalCache");
        CacheNode remoteCache = new CacheNode("RemoteCache");

        cacheManager.addCacheNode(localCache);
        cacheManager.addCacheNode(remoteCache);

        CacheManager anotherCacheManager = CacheManager.getInstance();
        anotherCacheManager.printCacheNodes();

        cacheManager.removeCacheNode(localCache);
        anotherCacheManager.printCacheNodes();
    }
}