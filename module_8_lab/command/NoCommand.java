class NoCommand implements ICommand {
    @Override
    public void execute() {
        System.out.println("Команда не назначена.");
    }

    @Override
    public void undo() {
        System.out.println("Отменять нечего.");
    }
}