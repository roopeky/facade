import java.util.Arrays;

public class Memory {
    private byte[] data;

    public Memory() {
        this.data = new byte[1024];
    }

    public void load(byte[] data) {
        System.out.println("Memory loading " + data.length + " bytes");
        this.data = Arrays.copyOf(data, this.data.length);
    }

    public byte[] read(long address) {
        System.out.println("Memory read from address " + address);
        return new byte[]{data[(int) address]};
    }

    public void write(long address, byte[] data) {
        System.out.println("Memory write to address " + address + " with data " + Arrays.toString(data));
        this.data[(int) address] = data[0];
    }
}
