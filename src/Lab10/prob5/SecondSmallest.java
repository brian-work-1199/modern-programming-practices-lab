package Lab10.prob5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SecondSmallest {

    public static <T extends Comparable<T>> T secondSmallest(List<T> list){
        List<T> tempList = list.stream().sorted().collect(Collectors.toList());
        return tempList.get(1);
    }
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 8, 1, 2);
        System.out.println("Second smallest number is: " + secondSmallest(numbers));

        List<String> words = Arrays.asList("apple", "orange", "banana", "pear");
        System.out.println("Second smallest word is: " + secondSmallest(words));
    }
}
