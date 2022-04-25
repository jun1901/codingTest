package primeFactorization;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindPrimes {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long num = (long) Math.pow(2, Long.parseLong(br.readLine())) -1;

        for (long i = 2; i <= num; i++) {
            if(isPrime(i)) System.out.printf("%d ", i);
        }
        long end = System.currentTimeMillis();
        System.out.println();
        System.out.println(end-start);
    }

    private static boolean isPrime(long n) {
        long sqrt = (long) Math.floor(Math.sqrt(n));
        for (long i = 2; i <= sqrt +1 ; i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
}
