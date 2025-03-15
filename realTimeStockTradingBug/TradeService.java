public class TradeService {
    private RateLimiterService rateLimiterService;
    private MarketDataService marketDataService;

    public TradeService(RateLimiterService rateLimiterService, MarketDataService marketDataService) {
        this.rateLimiterService = rateLimiterService;
        this.marketDataService = marketDataService;
    }

    public void processTrade(TradeRequest tradeRequest) throws Exception {
        if (rateLimiterService.allowRequest(tradeRequest.getUserId())) {
            MarketData marketData = marketDataService.getMarketData(tradeRequest.getSymbol());
            // Process the trade...
        } else {
            throw new Exception("Rate limit exceeded for user: " + tradeRequest.getUserId());
        }
    }
}