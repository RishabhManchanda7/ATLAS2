package Day13;

import java.util.LinkedList;
public class Task6{
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList();
        list.add("AA");
        list.add("BB");
        list.add("CC");
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        System.out.println("ALl Items:");
        for (String i : list){
            System.out.println(i);
        }
    }
}

