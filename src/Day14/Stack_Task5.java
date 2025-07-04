package Day14;

import java.util.Stack;

public class Stack_Task5 {
    public static void main(String[] args) {
        // 1. Create stack
        Stack<Integer> s = new Stack<>();

        // 2. Push elements (10, 30, 70)
        s.push(10);
        s.push(30);
        s.push(70);

        // 3. Print stack
        System.out.println(s); // Output: [10, 30, 70]
    }
}
