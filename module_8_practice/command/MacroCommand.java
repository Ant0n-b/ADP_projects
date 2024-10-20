import java.util.ArrayList;
import java.util.List;

public class MacroCommand implements ICommand {
    private List<ICommand> commands;

    public MacroCommand() {
        commands = new ArrayList<>();
    }

    public void addCommand(ICommand command) {
        commands.add(command);
    }

    public void execute() {
        for (ICommand command : commands) {
            command.execute();
        }
    }

    public void undo() {
        for (ICommand command : commands) {
            command.undo();
        }
    }
}
