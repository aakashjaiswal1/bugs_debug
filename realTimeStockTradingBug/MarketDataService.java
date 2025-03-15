import java.sql.Timestamp;
import java.util.*;
public class MarketDataService {
    private Map<String, MarketData> marketDataCache = new HashMap<>();

    public MarketData getMarketData(String symbol) {
        MarketData data = marketDataCache.get(symbol);
        if (data == null) {
            data = fetchMarketDataFromRemote(symbol);
            marketDataCache.put(symbol, data);
        }
        return data;
    }

    private MarketData fetchMarketDataFromRemote(String symbol) {
        // Simulate a network call to fetch market data
        return new MarketData(symbol, 100.0,12L,new Timestamp(1742028135)); // Example data
    }
}

