import java.util.*;

public class OrderedSet<T extends Comparable<T>> {
    private Set<T> items;

    // Constructor to initialize the set
    public OrderedSet(Set<T> items) {
        this.items = items;
    }

    // Method to get the items in a sorted list
    public List<T> getSortedItems() {
        List<T> sortedList = new ArrayList<>(items);
        Collections.sort(sortedList);
        return sortedList;
    }

    // Main method to demonstrate usage
    public static void main(String[] args) {
        // Example usage with Integer
        Set<Integer> intSet = new HashSet<>(Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5));
        OrderedSet<Integer> orderedIntSet = new OrderedSet<>(intSet);
        System.out.println("Sorted Integers: " + orderedIntSet.getSortedItems());

        // Example usage with String
        Set<String> stringSet = new HashSet<>(Arrays.asList("apple", "orange", "banana", "pear"));
        OrderedSet<String> orderedStringSet = new OrderedSet<>(stringSet);
        System.out.println("Sorted Strings: " + orderedStringSet.getSortedItems());
    }
}
