package Day24;

// Product Component
class Laptop {
    private int memory;
    private int storage;
    // Add other properties like graphic card, processor, etc.

    // Constructor
    public Laptop() {
        // Initialize default values if needed
    }

    // Getters
    public int getMemory() {
        return memory;
    }

    public int getStorage() {
        return storage;
    }

    // Setters
    public void setMemory(int memory) {
        this.memory = memory;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    // Optionally, you can override toString() for better representation
    @Override
    public String toString() {
        return "Laptop [memory=" + memory + "GB, storage=" + storage + "GB]";
    }
}

// Builder Interface


// Example usage
public class Task2 {
    public static void main(String[] args) {
        LaptopBuilder builder = new LaptopConcreteBuilder();
        Laptop laptop = builder.buildMemory(16)
                .buildStorage(512)
                .build();
        System.out.println(laptop);
    }
}