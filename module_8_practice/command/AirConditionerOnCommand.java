public class AirConditionerOnCommand implements ICommand {
    private AirConditioner ac;

    public AirConditionerOnCommand(AirConditioner ac) {
        this.ac = ac;
    }

    public void execute() {
        ac.on();
    }

    public void undo() {
        ac.off();
    }
}