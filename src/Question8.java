import java.util.ArrayList;

/**
 * Created by lrterry on 10/13/16.
 */
public class Question8 {
    // Copy the array list from the previous question to this one.
    // Iterate over the ArrayList and print out each element.

    public static void main(String[] args) {
        ArrayList<String> addString = new ArrayList<>();

        int i;

        addString.add("this");
        addString.add("is");
        addString.add("really");
        addString.add("something");
        addString.add("indeed");

        for (i =0; i < addString.size(); ++i);
        System.out.println(addString.get(i));
    }
}
