import java.util.Arrays;

public class DynamicArray {
    private String[] data;
    private int size;

    public DynamicArray() {
        data = new String[10];
    }

    public void add(String element) {
        if (size == data.length) {
            data = Arrays.copyOf(data, data.length * 2);

        }
        data[size++] = element;
    }

    public boolean contains(String target) {
        return Arrays.asList(data).contains(target);
    }

    public String get(int index) {
        return index >= 0 && index < size ? data[index] : null;
    }

    public String toString() {
        return Arrays.toString(data);
    }

    public static void main(String[] args) {
        DynamicArray array = new DynamicArray();
    }
}