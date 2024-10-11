public class GamingComputerBuilder implements IComputerBuilder {
    private String CPU;
    private String RAM;
    private String storage;
    private String GPU;
    private String OS;
    private String cooling;
    private String powerSupply;

    @Override
    public void setCPU() {
        CPU = "Intel i9";
    }

    @Override
    public void setRAM() {
        RAM = "32GB";
    }

    @Override
    public void setStorage() {
        storage = "1TB SSD";
    }

    @Override
    public void setGPU() {
        GPU = "NVIDIA RTX 3080";
    }

    @Override
    public void setOS() {
        OS = "Windows 11";
    }

    @Override
    public void setCooling() {
        cooling = "Liquid Cooling";
    }

    @Override
    public void setPowerSupply() {
        powerSupply = "750W";
    }

    @Override
    public Computer getComputer() {
        return new Computer(CPU, RAM, storage, GPU, OS, cooling, powerSupply);
    }
}
