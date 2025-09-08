import java.util.ArrayList;
import java.util.List;

public class DManager {
    private static DManager instance;
    private List<String> itemList;

    private DManager() {
        if (instance != null) {
            throw new IllegalStateException("Instance already exists. Use getInstance() method.");
        }
        itemList = new ArrayList<>();
    }

    public static synchronized DManager getInstance() {
        if (instance == null) {
            instance = new DManager();
        }
        return instance;
    }

    public synchronized void addItem(String item) {
        itemList.add(item);
    }

    public synchronized void removeItem(String item) {
        itemList.remove(item);
    }

    public synchronized List<String> getList() {
        return new ArrayList<>(itemList);
    }
}

// Example usage
class Main3 {
    public static void main(String[] args) {
        DManager manager1 = DManager.getInstance();
        DManager manager2 = DManager.getInstance();

        manager1.addItem("Item 1");
        manager2.addItem("Item 2");

        System.out.println(manager1.getList()); // Both references point to same instance
        System.out.println(manager2.getList()); // Will print same list

        manager1.removeItem("Item 1");
        System.out.println(manager2.getList()); // Item removed will be reflected in both
    }
}