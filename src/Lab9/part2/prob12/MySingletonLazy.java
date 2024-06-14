package Lab9.part2.prob12;

import java.util.Optional;
import java.util.function.Supplier;

public class MySingletonLazy {
    private static MySingletonLazy instance = null;
    private MySingletonLazy(){}
    public static MySingletonLazy getInstance(){
        instance = Optional.ofNullable(instance).orElseGet(MySingletonLazy::new);
        return instance;
    }
    public static void main(String[] args) {
        MySingletonLazy singleton1 = MySingletonLazy.getInstance();
        MySingletonLazy singleton2 = MySingletonLazy.getInstance();

        System.out.println(singleton1);
        System.out.println(singleton2);
        System.out.println(singleton1 == singleton2);
    }
}
