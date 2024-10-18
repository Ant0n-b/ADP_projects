public class TradingRobot implements IObserver {
    @Override
    public void update(String currency, float exchangeRate) {
        if (exchangeRate < 0.85) {
            System.out.println("Торговый робот: Покупаю " + currency + " по курсу " + exchangeRate);
        } else {
            System.out.println("Торговый робот: Продаю " + currency + " по курсу " + exchangeRate);
        }
    }
}
