package Lab9.part2.prob9;

import java.util.stream.IntStream;

public class PrintSquare {
    public static void main(String[] args) {
        printSquare(4);
    }
    static void printSquare(int num){
        IntStream.iterate(1, n -> nextSquare(n)).limit(num).forEach(System.out::println);
    }
    static int nextSquare(int n){
        return (int) Math.pow(Math.sqrt(n) + 1, 2);
    }
}
