package Lab8.prob5;

import java.util.Arrays;
import java.util.List;

/*
5. Redo lesson7.labs.prob3 in two different ways:
    b. Use a method reference in place of your lambda expression in (a)
 */
public class B {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon",
                "Away", "On Vacation", "Everywhere you want to be");

        list.forEach(B::accept);
    }
    private static void accept(String s) {
        System.out.println(s.toUpperCase());
    }
}
