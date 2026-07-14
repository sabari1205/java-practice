public class ComputerCpuComposition {
    public static void main(String[] args) {
        System.out.println("=== Composition Demo: Computer has-a CPU (Strong Ownership) ===");
        Computer myPc = new Computer("Custom Gaming Rig", "Intel i9-14900K", 24, 5.8);
        myPc.boot();
        myPc.displaySpecs();
        myPc.shutdown();
    }
}

class CPU {
    private String model;
    private int cores;
    private double clockSpeedGHz;

    public CPU(String model, int cores, double clockSpeedGHz) {
        this.model = model;
        this.cores = cores;
        this.clockSpeedGHz = clockSpeedGHz;
    }

    public void processData() {
        System.out.printf("  [CPU] %s (%d Cores @ %.1f GHz) is processing instructions at lightning speed!%n", model, cores, clockSpeedGHz);
    }

    public void display() {
        System.out.printf("  - Processor: %s | Cores: %d | Frequency: %.1f GHz%n", model, cores, clockSpeedGHz);
    }
}

class Computer {
    private String systemName;
    private CPU cpu; // Composition: Computer directly instantiates and owns CPU

    public Computer(String systemName, String cpuModel, int cores, double clockSpeedGHz) {
        this.systemName = systemName;
        // Strong lifecycle dependency: CPU is created inside Computer's constructor
        this.cpu = new CPU(cpuModel, cores, clockSpeedGHz);
    }

    public void boot() {
        System.out.println("[Computer] Powering on " + systemName + "...");
        cpu.processData();
    }

    public void displaySpecs() {
        System.out.println("--- System Specification ---");
        System.out.println("System Name: " + systemName);
        cpu.display();
    }

    public void shutdown() {
        System.out.println("[Computer] Shutting down " + systemName + " cleanly.");
    }
}
