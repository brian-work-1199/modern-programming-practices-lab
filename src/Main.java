import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.iterate(1, n -> n + 2);
        Stream<Integer> oddStream = stream.limit(15);
        System.out.println(oddStream.collect(Collectors.toList()));
//        System.out.println(stream);
    }

}