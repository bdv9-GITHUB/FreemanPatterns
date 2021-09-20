package facade;

import facade.hard.Drive;
import facade.hard.Memory;
import facade.hard.Processor;

/*
    Facade
 */
public class Computer {
    private Processor cpu;
    private Memory memory;
    private Drive hardDrive;

    public Computer() {
        this.cpu = new Processor();
        this.memory = new Memory();
        this.hardDrive = new Drive();
    }

    public void startComputer() {
        cpu.freeze();
        memory.load(0, hardDrive.read(0, 8));
        cpu.jump(0);
        cpu.execute();
    }
}
