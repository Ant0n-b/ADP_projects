public class SmartHomeControl {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();

        
        Light livingRoomLight = new Light();
        Television tv = new Television();
        AirConditioner ac = new AirConditioner();

           
        ICommand lightOn = new LightOnCommand(livingRoomLight);
        ICommand lightOff = new LightOffCommand(livingRoomLight);

           
        ICommand tvOn = new TelevisionOnCommand(tv);
        ICommand tvOff = new TelevisionOffCommand(tv);

           
        ICommand acOn = new AirConditionerOnCommand(ac);
        ICommand acOff = new AirConditionerOffCommand(ac);

        
        remote.setCommand(0, lightOn, lightOff);
        remote.setCommand(1, tvOn, tvOff);
        remote.setCommand(2, acOn, acOff);

        
        System.out.println("Управление светом:");
        remote.pressOnButton(0);
        remote.pressOffButton(0);
        remote.pressUndoButton();

        System.out.println("\nУправление телевизором:");
        remote.pressOnButton(1);
        remote.pressOffButton(1);
        remote.pressUndoButton();

        System.out.println("\nУправление кондиционером:");
        remote.pressOnButton(2);
        remote.pressOffButton(2);
        remote.pressUndoButton();

            
        ICommand[] partyOn = { lightOn, tvOn, acOn };
        MacroCommand partyOnMacro = new MacroCommand(partyOn);

        
        ICommand[] partyOff = { lightOff, tvOff, acOff };
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        
        remote.setCommand(3, partyOnMacro, partyOffMacro);

        System.out.println("\nМакрокоманда: Включить все устройства");
        remote.pressOnButton(3);

        System.out.println("\nМакрокоманда: Выключить все устройства");
        remote.pressOffButton(3);
        remote.pressUndoButton();
    }
}