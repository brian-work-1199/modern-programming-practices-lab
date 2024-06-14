import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream string = Stream.of("A","good","day","to","write","some","java");
        System.out.println(string.reduce("",(a, b)-> a + " " + b));
    }

}