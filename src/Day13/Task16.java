package Day13;
import java.util.Spliterator;
import java.util.LinkedList;

import java.util.*;
public class Task16 {
    public static void main(String[] args)     {


        LinkedList<String> l = new LinkedList<>();


        l.add("Meher");
        l.add("Prasunamba");
        l.add(".MK");

        System.out.print(l);

        Spliterator<String> it = l.spliterator();


        System.out.print("Splitting the list:");
        it.forEachRemaining(System.out::println);
    }
}

