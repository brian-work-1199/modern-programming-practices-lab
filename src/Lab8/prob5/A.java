package Lab8.prob5;

import java.util.Arrays;
import java.util.List;

/*
5. Redo lesson7.labs.prob3 in two different ways:
    a. Use a lambda expression instead of directly defining a Consumer
 */
public class A {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon",
                "Away", "On Vacation", "Everywhere you want to be");

        list.forEach(s -> System.out.println(s.toUpperCase()));
    }
}
