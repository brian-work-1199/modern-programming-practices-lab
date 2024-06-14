package Lab9.part2.prob10c;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntegerStream {
    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(5,13,8,2,10,1);
        IntSummaryStatistics stats = integerStream.collect(Collectors.summarizingInt(Integer::intValue));
        System.out.println("Min :" + stats.getMin());
        System.out.println("Max :" + stats.getMax());
    }
}
