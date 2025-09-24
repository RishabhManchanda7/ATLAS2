package Day28.Controller.StrategyPattern.Controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>(Arrays.asList("apple", "Banana", "cherry", "date"));
        
        SortContext context = new SortContext();
        
        System.out.println("Original: " + items);
        
        // Sort by string (alphabetical)
        context.setStrategy(new StringSort());
        List<String> stringSort = new ArrayList<>(items);
        context.executeSort(stringSort);
        System.out.println("String sort: " + stringSort);
        
        // Sort by length
        context.setStrategy(new LengthSort());
        List<String> lengthSort = new ArrayList<>(items);
        context.executeSort(lengthSort);
        System.out.println("Length sort: " + lengthSort);
    }
}