import java.util.ArrayList;
import java.util.List;

class Friend {
    String firstName;
    String lastName;

    Friend(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return firstName + ", " + lastName;
    }
}

public class Task013 {
    public static void main(String[] args) {
        List<Friend> friends = new ArrayList<>();

        friends.add(new Friend("Jai", "Sharma"));
        friends.add(new Friend("Raj", "Smith"));
        friends.add(new Friend("Utkarsh", "Thakur"));
        friends.add(new Friend("Salman ", "Khan"));
        friends.add(new Friend("Amit", "shah"));

        friends.stream()
                .filter(p -> p.firstName.equals("Utkarsh")) // Corrected filter condition
                .map(p -> p.toString().toUpperCase()) // Convert to string and then to uppercase
                .sorted() // Sort the uppercase names
                .forEach(System.out::println); // Print the result



        System.out.println("My Friends' Full Names:");
//        for (Friend friend : friends) {
//            System.out.println(friend);
//        }
    }
}
