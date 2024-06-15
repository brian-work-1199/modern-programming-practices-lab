package quiz3;

import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class LambdaLibrary {
    public static final
    BiFunction<List<Customer>, String, List<String>> CUSTOMER
            = (list,cityName) -> list.stream()
            .filter(customer -> customer.getCity().equals(cityName))
            .map(Customer::getName)
            .collect(Collectors.toList());
}
