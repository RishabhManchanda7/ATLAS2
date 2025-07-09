package Day15;

public class StringReverser {

    // Recursive method to reverse a string
    public static String reverseString(String str) {
        // Base case: if the string is empty or has only one character
        if (str == null || str.length() <= 1) {
            return str;
        }
        // Recursive case: take the last character and put it at the beginning
        // of the reversed substring
        return str.charAt(str.length() - 1) + reverseString(str.substring(0, str.length() - 1));
    }

    public static void main(String[] args) {
        String original = "Hello World";
        String reversed = reverseString(original);

        System.out.println("Original string: " + original);
        System.out.println("Reversed string: " + reversed);
    }
}
