public class SmartHomeTest {
    public static void main(String[] args) {
        
        Light livingRoomLight = new Light();
        Door frontDoor = new Door();
        Thermostat thermostat = new Thermostat();
        
        
        ICommand lightOn = new LightOnCommand(livingRoomLight);
        ICommand lightOff = new LightOffCommand(livingRoomLight);
        ICommand doorOpen = new DoorOpenCommand(frontDoor);
        ICommand doorClose = new DoorCloseCommand(frontDoor);
        ICommand tempIncrease = new ThermostatIncreaseCommand(thermostat);
        ICommand tempDecrease = new ThermostatDecreaseCommand(thermostat);
        
        
        RemoteControl remote = new RemoteControl();
        
        
        remote.executeCommand(lightOn);        
        remote.executeCommand(doorOpen);       
        remote.executeCommand(tempIncrease);   
        
        
        remote.undoLastCommand();              
        remote.undoLastCommand();              
        remote.undoLastCommand();              
    }
}