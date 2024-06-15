package quiz3;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Customer> list = Arrays.asList(new Customer(100, "Davis", "Iowa city"),
                new Customer(101, "Sims", "London"),
                new Customer(102, "Stevens", "Fairfield"),
                new Customer(103, "Reardon", "London"),
                new Customer(104, "Cummings", "Paris"));

        List<String> result = LambdaLibrary.CUSTOMER.apply(list, "London");
        System.out.println(result);
    }
}
