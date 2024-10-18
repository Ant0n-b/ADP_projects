public class Main2 {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        WeatherDisplay mobileApp = new WeatherDisplay("Мобильное приложение");
        WeatherDisplay digitalBillboard = new WeatherDisplay("Электронное табло");
        EmailAlert emailAlert = new EmailAlert("user@example.com");

        weatherStation.registerObserver(mobileApp);
        weatherStation.registerObserver(digitalBillboard);
        weatherStation.registerObserver(emailAlert);

        weatherStation.setTemperature(25.0f);
        weatherStation.setTemperature(30.0f);

        weatherStation.removeObserver(digitalBillboard);
        weatherStation.setTemperature(28.0f);

        // Попытка удалить несуществующего наблюдателя
        weatherStation.removeObserver(digitalBillboard);

        // Некорректная температура
        weatherStation.setTemperature(-60.0f);
    }
}
