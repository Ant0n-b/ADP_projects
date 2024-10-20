public class SmartHomeSystem {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl(5);

        Light livingRoomLight = new Light();
        AirConditioner ac = new AirConditioner();
        Television tv = new Television();

        ICommand lightOn = new LightOnCommand(livingRoomLight);
        ICommand lightOff = new LightOffCommand(livingRoomLight);
        ICommand acOn = new AirConditionerOnCommand(ac);
        ICommand acOff = new AirConditionerOffCommand(ac);
        ICommand tvOn = new TelevisionOnCommand(tv);
        ICommand tvOff = new TelevisionOffCommand(tv);

        remote.setCommand(0, lightOn, lightOff);
        remote.setCommand(1, acOn, acOff);
        remote.setCommand(2, tvOn, tvOff);

        remote.onButtonPressed(0);
        remote.offButtonPressed(0);
        remote.undoButtonPressed();

        remote.onButtonPressed(1);
        remote.offButtonPressed(1);
        remote.undoButtonPressed();

        remote.onButtonPressed(2);
        remote.offButtonPressed(2);
        remote.undoButtonPressed();

        MacroCommand macroCommand = new MacroCommand();
        macroCommand.addCommand(lightOn);
        macroCommand.addCommand(acOn);
        macroCommand.addCommand(tvOn);

        System.out.println("Выполнение макрокоманды:");
        macroCommand.execute();
    }
}
