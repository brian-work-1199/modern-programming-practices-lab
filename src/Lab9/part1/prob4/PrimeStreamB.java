package Lab9.part1.prob4;

import java.util.stream.Stream;

public class PrimeStreamB {
    public static void main(String[] args) {
        PrimeStreamB ps = new PrimeStreamB(); //PrimeStream is enclosing class
        printFirstNPrimes(10);
        System.out.println("====");
        ps.printFirstNPrimes(5);
    }

    static void printFirstNPrimes(long m){
        Stream.iterate(2, n -> nextPrime(n))
                .limit(m).forEach(System.out::println);
    }

    static int nextPrime(int n) {
        n += 1;
        if (isPrime(n)) return n;
        return nextPrime(n);
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
