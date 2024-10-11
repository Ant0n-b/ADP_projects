public interface IComputerBuilder {
    void setCPU();
    void setRAM();
    void setStorage();
    void setGPU();
    void setOS();
    void setCooling();
    void setPowerSupply();
    Computer getComputer();
}
