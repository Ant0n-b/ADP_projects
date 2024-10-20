import java.util.Stack;

public class RemoteControl {
    private ICommand[] onCommands;
    private ICommand[] offCommands;
    private Stack<ICommand> commandHistory;

    public RemoteControl(int slots) {
        onCommands = new ICommand[slots];
        offCommands = new ICommand[slots];
        commandHistory = new Stack<>();
    }

    public void setCommand(int slot, ICommand onCommand, ICommand offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonPressed(int slot) {
        if (onCommands[slot] != null) {
            onCommands[slot].execute();
            commandHistory.push(onCommands[slot]);
        } else {
            System.out.println("Ошибка: Команда не назначена для этого слота.");
        }
    }

    public void offButtonPressed(int slot) {
        if (offCommands[slot] != null) {
            offCommands[slot].execute();
            commandHistory.push(offCommands[slot]);
        } else {
            System.out.println("Ошибка: Команда не назначена для этого слота.");
        }
    }

    public void undoButtonPressed() {
        if (!commandHistory.isEmpty()) {
            ICommand command = commandHistory.pop();
            command.undo();
        } else {
            System.out.println("Ошибка: Нет команд для отмены.");
        }
    }
}