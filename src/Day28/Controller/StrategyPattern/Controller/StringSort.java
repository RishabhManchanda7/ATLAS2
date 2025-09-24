package Day28.Controller.StrategyPattern.Controller;

import java.util.Collections;
import java.util.List;

public class StringSort implements SortingStrategy{
    @Override
    public void sort(List<String> items) {
        int n = items.size();
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if(compare(items.get(j), items.get(j+1))>0){
                    String temp = items.get(j);
                    items.set(j, items.get(j+1));
                    items.set(j+1, temp);
                }
            }
        }
    }

    private int compare(String s1, String s2){
        return s1.compareToIgnoreCase(s2);
    }
}