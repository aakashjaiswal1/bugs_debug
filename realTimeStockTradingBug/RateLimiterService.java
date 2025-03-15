import java.util.*;

public class RateLimiterService {
    private Map<String, Long> requestCounts = new HashMap<>();
    private final long rateLimit = 10; // 10 requests per second

    public synchronized boolean allowRequest(String userId) {
        long currentTime = System.currentTimeMillis();
        Long lastRequestTime = requestCounts.get(userId);

        if (lastRequestTime == null || (currentTime - lastRequestTime) > 1000) {
            requestCounts.put(userId, currentTime);
            return true;
        } else {
            return false;
        }
    }
}