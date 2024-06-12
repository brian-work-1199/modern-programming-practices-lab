package Lab9.prob4;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<Integer> primes = Stream.iterate(2, n -> nextPrime(n))
                .limit(5);
        primes.forEach(System.out::println);
    }

    static int nextPrime(int n) {
        n += 1;
        if (isPrime(n)) {
            return n;
        } else {
            return nextPrime(n);
        }
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
