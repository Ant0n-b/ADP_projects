public class BuilderPatternTest {
    public static void main(String[] args) {
        // Создаем офисный компьютер
        IComputerBuilder officeBuilder = new OfficeComputerBuilder();
        ComputerDirector officeDirector = new ComputerDirector(officeBuilder);
        officeDirector.constructComputer();
        Computer officeComputer = officeDirector.getComputer();
        System.out.println(officeComputer);

        // Создаем игровой компьютер
        IComputerBuilder gamingBuilder = new GamingComputerBuilder();
        ComputerDirector gamingDirector = new ComputerDirector(gamingBuilder);
        gamingDirector.constructComputer();
        Computer gamingComputer = gamingDirector.getComputer();
        System.out.println(gamingComputer);
    }
}
