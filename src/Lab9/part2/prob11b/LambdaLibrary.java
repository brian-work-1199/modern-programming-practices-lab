package Lab9.part2.prob11b;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LambdaLibrary {
    public static final
    Function<List<Employee>, String> EMPLOYEES
            = (list) -> list.stream()
            .filter(employee -> employee.getSalary() > 100000)
            .filter(employee -> employee.getLastName().compareToIgnoreCase("N") >= 0)
            .map(employee -> employee.getFirstName() + " " + employee.getLastName())
            .sorted()
            .collect(Collectors.joining(", "));
}
