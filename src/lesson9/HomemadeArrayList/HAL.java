package lesson9.HomemadeArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class HAL {
    public static void main(String[] args) {

        ArrayList<String> friends = new ArrayList<>();

        friends.add("Mike");
        friends.add("Karl");
        friends.add("Django");
        friends.add("Anna");
        friends.add("Max");

        System.out.println(friends);

        friends.remove("Max");

        System.out.println(friends);

        System.out.println(Arrays.toString(friends.toArray()));

        System.out.println("Size: " + friends.size());

        System.out.println("Karl?: " + friends.contains("Karl"));

        System.out.println("Anna's index: " + friends.indexOf("Anna"));

        System.out.println(friends.get(3));

        System.out.println(friends.set(2, "Django Free"));

        System.out.println(friends.subList(1, 3));

        System.out.println(friends.remove(0));

        Iterator<String> iterator = friends.iterator();
        while (friends.iterator().hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

