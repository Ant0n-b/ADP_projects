public class ThermostatIncreaseCommand implements ICommand {
    private Thermostat thermostat;

    public ThermostatIncreaseCommand(Thermostat thermostat) {
        this.thermostat = thermostat;
    }

    @Override
    public void execute() {
        thermostat.increaseTemperature();
    }

    @Override
    public void undo() {
        thermostat.decreaseTemperature();
    }
}