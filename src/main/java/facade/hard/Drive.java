package facade.hard;

public class Drive {
    public byte[] read(long lba, int size) {
        System.out.println("Drive read from " + lba + " to " + size);

        return null;
    }
}
