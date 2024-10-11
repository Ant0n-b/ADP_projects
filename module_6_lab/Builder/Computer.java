public class Computer {
    private String CPU;
    private String RAM;
    private String storage;
    private String GPU;
    private String OS;
    private String cooling; // Дополнительно: тип охлаждения
    private String powerSupply; // Дополнительно: блок питания

    // Конструктор
    public Computer(String CPU, String RAM, String storage, String GPU, String OS, String cooling, String powerSupply) {
        this.CPU = CPU;
        this.RAM = RAM;
        this.storage = storage;
        this.GPU = GPU;
        this.OS = OS;
        this.cooling = cooling;
        this.powerSupply = powerSupply;
    }

    @Override
    public String toString() {
        return "Компьютер: CPU - " + CPU +
               ", RAM - " + RAM +
               ", Накопитель - " + storage +
               ", GPU - " + GPU +
               ", ОС - " + OS +
               ", Охлаждение - " + cooling +
               ", Блок питания - " + powerSupply;
    }
}
