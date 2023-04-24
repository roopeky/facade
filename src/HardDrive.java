import java.util.Arrays;

public class HardDrive {
    private byte[] data;

    public HardDrive() {
        this.data = new byte[1024];
    }

    public byte[] readBootSector() {
        System.out.println("Hard Drive reading boot sector");
        return Arrays.copyOfRange(data, 0, 128);
    }
}
