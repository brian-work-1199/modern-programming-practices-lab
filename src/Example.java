import java.util.function.Function;

public class Example {
    static Function<String, String> toUpperCase = s -> s.toUpperCase();
    void evaluate(){
        System.out.println(toUpperCase.apply("hello"));
    }

    public static void main(String[] args) {
        (new Example()).evaluate();
    }
}
