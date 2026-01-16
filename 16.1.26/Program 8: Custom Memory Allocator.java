import java.util.*;

class MemoryAllocator {
    private final int size;
    private final boolean[] memory;

    public MemoryAllocator(int size) {
        this.size = size;
        this.memory = new boolean[size];
    }

    public int malloc(int length) {
        for (int i = 0; i <= size - length; i++) {
            boolean free = true;
            for (int j = 0; j < length; j++) {
                if (memory[i + j]) { free = false; break; }
            }
            if (free) {
                Arrays.fill(memory, i, i + length, true);
                return i;
            }
        }
        return -1;
    }

    public void free(int start, int length) {
        Arrays.fill(memory, start, start + length, false);
    }

    public void print() {
        for (boolean b : memory) System.out.print(b ? "1" : "0");
        System.out.println();
    }

    public static void main(String[] args) {
        MemoryAllocator m = new MemoryAllocator(20);
        int addr = m.malloc(5);
        System.out.println("Allocated at: " + addr);
        m.print();
        m.free(addr, 5);
        m.print();
    }
}
