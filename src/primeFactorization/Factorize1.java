package primeFactorization;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Factorize1 {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        HashMap<Long, Integer> factors = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = (long) Math.pow(2, Integer.parseInt(br.readLine()))-1;
        int sqrtn = (int) Math.floor(Math.sqrt(n));

        for (int i = 2; i <= sqrtn + 1; i++) {
            while (n % i == 0){
                addFactor(factors,i);
                n /= i;
            }
        }
        if(n > 1) addFactor(factors,n);

        Iterator<Map.Entry<Long, Integer>> iterator = factors.entrySet().iterator();
        System.out.print("{");
        while (iterator.hasNext()){
            Map.Entry<Long, Integer> entry = iterator.next();
            System.out.printf(" %d: %d,", entry.getKey(), entry.getValue());
        }
        System.out.println(" }");
        long end = System.currentTimeMillis();

        System.out.println((end - start)/1000);

    }

    private static void addFactor(HashMap<Long, Integer> factors, long n) {
        if(factors.containsKey(n)) factors.put(n, factors.get(n) + 1);
        else                       factors.put(n, 1);
    }
}
