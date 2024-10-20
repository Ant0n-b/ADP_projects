public class AirConditionerOffCommand implements ICommand {
    private AirConditioner ac;

    public AirConditionerOffCommand(AirConditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.off();
    }

    @Override
    public void undo() {
        ac.on();
    }
}