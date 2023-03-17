public class Computer {
    String gpu;
    String cpu;
    double memory;
    boolean powered;

    public Computer(String gpu, String cpu, double memory, boolean powered) {
        this.gpu = gpu;
        this.cpu = cpu;
        this.memory = memory;
        this.powered = powered;
    }
    
    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public double getMemory() {
        return memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }

    public boolean isPowered() {
        return powered;
    }

    public void setPowered(boolean powered) {
        this.powered = powered;
    }

}
