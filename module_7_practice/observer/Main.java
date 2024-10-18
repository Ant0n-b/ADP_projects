import java.util.Random;

public class Main {
    public static void main(String[] args) {
        StockExchange stockExchange = new StockExchange();
        Trader trader1 = new Trader("Иван");
        AutoTrader autoTrader1 = new AutoTrader("АвтоТрейдер1", 100.0);
        
        stockExchange.registerObserver("AAPL", trader1);
        stockExchange.registerObserver("AAPL", autoTrader1);
        
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            double newPrice = 80 + random.nextDouble() * 50;
            stockExchange.setStockPrice("AAPL", newPrice);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
