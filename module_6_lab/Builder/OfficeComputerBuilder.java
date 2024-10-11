public class OfficeComputerBuilder implements IComputerBuilder {
    private String CPU;
    private String RAM;
    private String storage;
    private String GPU;
    private String OS;
    private String cooling;
    private String powerSupply;

    @Override
    public void setCPU() {
        CPU = "Intel i3";
    }

    @Override
    public void setRAM() {
        RAM = "8GB";
    }

    @Override
    public void setStorage() {
        storage = "1TB HDD";
    }

    @Override
    public void setGPU() {
        GPU = "Integrated";
    }

    @Override
    public void setOS() {
        OS = "Windows 10";
    }

    @Override
    public void setCooling() {
        cooling = "Air Cooling";
    }

    @Override
    public void setPowerSupply() {
        powerSupply = "450W";
    }

    @Override
    public Computer getComputer() {
        return new Computer(CPU, RAM, storage, GPU, OS, cooling, powerSupply);
    }
}