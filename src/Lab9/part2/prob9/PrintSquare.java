package Lab9.part2.prob9;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrintSquare {
    public static void main(String[] args) {
        printSquare(4);
    }
    static void printSquare(int num){
        Stream.iterate(1, n -> n+1).limit(num).forEach(System.out::println);
    }
    static int nextSquare(int n){
        return (int) Math.pow(Math.sqrt(n) + 1, 2);
    }
}
