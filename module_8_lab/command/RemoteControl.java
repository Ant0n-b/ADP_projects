public class RemoteControl {
    private ICommand[] onCommands;
    private ICommand[] offCommands;
    private ICommand undoCommand;

    public RemoteControl() {
        onCommands = new ICommand[7];
        offCommands = new ICommand[7];
        ICommand noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, ICommand onCommand, ICommand offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void pressOnButton(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void pressOffButton(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void pressUndoButton() {
        undoCommand.undo();
    }
}