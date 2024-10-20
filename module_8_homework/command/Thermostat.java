public class Thermostat {
    private int temperature;

    public void increaseTemperature() {
        temperature += 1;
        System.out.println("Temperature increased to " + temperature);
    }
    
    public void decreaseTemperature() {
        temperature -= 1;
        System.out.println("Temperature decreased to " + temperature);
    }
}