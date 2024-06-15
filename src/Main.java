import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<Integer>();
        ints.add(4);
        ints.add(5);
        List<? extends Number> nums = ints;
//        nums.add(2);
    }

}