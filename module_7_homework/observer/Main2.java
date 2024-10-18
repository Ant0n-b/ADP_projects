public class Main2 {
    public static void main(String[] args) {
        CurrencyExchange currencyExchange = new CurrencyExchange();

        ConsoleObserver consoleObserver = new ConsoleObserver("Экранный наблюдатель");
        FileObserver fileObserver = new FileObserver("exchange_rates.txt");
        TradingRobot tradingRobot = new TradingRobot();

        currencyExchange.registerObserver(consoleObserver);
        currencyExchange.registerObserver(fileObserver);
        currencyExchange.registerObserver(tradingRobot);

        currencyExchange.setExchangeRate(0.84f);
        currencyExchange.setExchangeRate(0.90f);

        currencyExchange.removeObserver(consoleObserver);

        currencyExchange.setExchangeRate(0.82f);
    }
}
