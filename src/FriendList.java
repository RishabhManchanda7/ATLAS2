import java.util.ArrayList;

public class FriendList {
    public static void main(String[] args) {
        ArrayList<String> friends = new ArrayList<>();

        friends.add("Jai");
        friends.add("Raj");
        friends.add("Charlie");
        friends.add("David");
        friends.add("Eve");
        System.out.println("My Friends:");

        for (String friend : friends) {
            System.out.println(friend);
        }
    }
}


