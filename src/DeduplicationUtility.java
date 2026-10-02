import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DeduplicationUtility {
    // Generic method to remove duplicates
    public static <T> List<T> removeDuplicates(List<T> inputList) {
        // Use LinkedHashSet to preserve insertion order
        Set<T> set = new LinkedHashSet<>(inputList);
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Abhi");
        names.add("Bobby");
        names.add("Abhi"); // duplicate
        names.add("Chaithu");
        names.add("Bobby");   // duplicate

        System.out.println("Original List: " + names);

        List<String> uniqueNames = removeDuplicates(names);

        System.out.println("Deduplicated List: " + uniqueNames);
    }
}
