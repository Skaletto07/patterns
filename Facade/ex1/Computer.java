package patterns.Facade.ex1;

public class Computer {
    private HDD hdd;
    private CPU cpu;
    private Memory memory;

    public Computer(HDD hdd, CPU cpu, Memory memory) {
        this.hdd = hdd;
        this.cpu = cpu;
        this.memory = memory;
    }

    public void power() {
        memory.load(1, hdd.read(2));
        cpu.jmp(1);
        cpu.exec();
    }
}
