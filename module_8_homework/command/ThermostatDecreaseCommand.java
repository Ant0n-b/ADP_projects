public class ThermostatDecreaseCommand implements ICommand {
    private Thermostat thermostat;

    public ThermostatDecreaseCommand(Thermostat thermostat) {
        this.thermostat = thermostat;
    }

    @Override
    public void execute() {
        thermostat.decreaseTemperature();
    }

    @Override
    public void undo() {
        thermostat.increaseTemperature();
    }
}