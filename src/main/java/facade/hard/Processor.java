package facade.hard;

public class Processor {
    public void freeze() {
        System.out.println("Processor.freeze");
    }

    public void jump(long position) {
        System.out.println("Processor jump to " + position);
    }

    public void execute() {
        System.out.println("Processor execute");
    }
}
