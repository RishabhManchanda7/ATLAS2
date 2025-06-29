package Day13;

import java.util.LinkedList;

public class Task8 {

    public static void main(String[] args) {
        java.util.LinkedList<String> list = new LinkedList();
        list.add("11");
        list.add("22");
        list.add("33");
        list.add("45");
        list.add("56");
        list.add("87");
        list.set(1,"23");


        System.out.println();
        System.out.println(list.removeFirst());
        System.out.println(list.removeLast());
        System.out.println(list.remove("11"));
        System.out.println(list.remove("33"));
        System.out.println(list.remove("99"));

        System.out.println("ALl Items:");
        for (String i : list){
            System.out.println(i);
        }
    }
}

