public class HoTheFa {
    private TV tv;
    private AudioSystem audioSystem;
    private DVDPlayer dvdPlayer;
    private GameConsole gameConsole;

    public HoTheFa(TV tv, AudioSystem audioSystem, DVDPlayer dvdPlayer, GameConsole gameConsole) {
        this.tv = tv;
        this.audioSystem = audioSystem;
        this.dvdPlayer = dvdPlayer;
        this.gameConsole = gameConsole;
    }

    public void watchMovie(int channel) {
        System.out.println("Подготовка к просмотру фильма...");
        tv.turnOn();
        tv.setChannel(channel);
        audioSystem.turnOn();
        audioSystem.setVolume(50);
        dvdPlayer.play();
    }

    public void playGame(String game) {
        System.out.println("Подготовка к запуску игры...");
        gameConsole.turnOn();
        gameConsole.startGame(game);
        audioSystem.turnOn();
        audioSystem.setVolume(70);
    }

    public void listenToMusic() {
        System.out.println("Подготовка к прослушиванию музыки...");
        tv.turnOn();
        audioSystem.turnOn();
        audioSystem.setVolume(40);
    }

    public void turnOffAll() {
        System.out.println("Выключение всей системы...");
        tv.turnOff();
        audioSystem.turnOff();
        dvdPlayer.stop();
        System.out.println("Система полностью выключена.");
    }
}
