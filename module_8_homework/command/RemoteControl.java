import java.util.Stack;

public class RemoteControl {
    private Stack<ICommand> commandHistory = new Stack<>();

    public void executeCommand(ICommand command) {
        command.execute();
        commandHistory.push(command);
    }

    public void undoLastCommand() {
        if (!commandHistory.isEmpty()) {
            ICommand lastCommand = commandHistory.pop();
            lastCommand.undo();
        } else {
            System.out.println("No command to undo");
        }
    }
}