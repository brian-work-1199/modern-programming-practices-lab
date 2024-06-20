package Lab9.part1.prob4;

import java.util.stream.Stream;

public class PrimeStreamA2 {
    public static void main(String[] args) {
       Stream<Integer> primeStream = Stream.iterate(2, n -> n+1).filter(PrimeStreamA2::isPrime);
       System.out.println("Print first 5 primes");
       primeStream.limit(5).forEach(System.out::println);
    }

    private static boolean isPrime(Integer integer) {
        for(int i = 2; i <= Math.sqrt(integer); i++){
            if(integer % i == 0) return false;
        }
        return true;
    }
}
