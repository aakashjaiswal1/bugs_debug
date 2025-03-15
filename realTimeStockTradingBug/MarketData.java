import java.util.Date;

public class MarketData {
    private String symbol;       // Stock symbol (e.g., "AAPL")
    private double price;        // Current market price
    private long volume;         // Trading volume
    private Date timestamp;      // Timestamp of the data

    // Constructor
    public MarketData(String symbol, double price, long volume, Date timestamp) {
        this.symbol = symbol;
        this.price = price;
        this.volume = volume;
        this.timestamp = timestamp;
    }

    // Getters and Setters
    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public long getVolume() {
        return volume;
    }

    public void setVolume(long volume) {
        this.volume = volume;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    // toString method for debugging
    @Override
    public String toString() {
        return STR."MarketData{symbol='\{symbol}\{'\''}, price=\{price}, volume=\{volume}, timestamp=\{timestamp}\{'}'}";
    }
}
