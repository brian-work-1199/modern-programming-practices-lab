package Lab9.part1.prob4;

import java.util.stream.Stream;

public class PrimeStreamA {
    public static void main(String[] args) {
        Stream.iterate(2, n -> nextPrime(n))
                .limit(5).forEach(System.out::println);
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
