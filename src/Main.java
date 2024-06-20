import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static <T extends Comparable<? super T>> T max(List<T> list) {
        T max = list.get(0);
        for(T i : list) {
            if(i.compareTo(max) > 0) {
                max = i;
            }
        }
        return max;
    }
    public static void main(String[] args) {
//        List<LocalDate> localDates = new ArrayList<>();
//        localDates.add(LocalDate.of(2024,6,18));
//        localDates.add(LocalDate.of(2024,6,17));
//        LocalDate localDate =  max(localDates);
//        System.out.println(localDate);

//        List<? super Integer> test = new ArrayList<>();
//        test.add(5);
//        System.out.println(test.get(0));
//        Integer val = test.get(0);

//        List<String> list = new ArrayList<>();
//        list.add("a");
//        list.add("b");
//        list.forEach(str -> str.toUpperCase());
//        System.out.println(list);

        BiFunction<Double, Double, List<Double>> biFunction = (x, y) -> {
            List<Double> list = new ArrayList<>();
            list.add(Math.pow(x,y));
            list.add(x * y);
            return list;
        };
        System.out.println(biFunction.apply(2.0,3.0));
    }

    class MyClass{
        BiPredicate<Double, Double> lambda = this::test;

        private boolean test(Double x, Double y) {
            return x * y < x + y;
        }
    }

}