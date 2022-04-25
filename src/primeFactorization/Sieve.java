package primeFactorization;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Sieve {
    public static void main(String[] args) throws IOException {

        long start = System.currentTimeMillis();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = (int) Math.pow(2, Integer.parseInt(br.readLine()))-1;
        int sqrtn = (int) Math.floor(Math.sqrt(n));
        int[] flags = new int[n+1];
        Arrays.fill(flags,1);
        flags[0]=flags[1]=0;

        for (int i = 2; i < sqrtn+1 ; i++) {
            if(flags[i] == 1){
                for (int j = i * i; j < n + 1; j += i) {
                    flags[j] = 0;
                }
            }
        }

        for (int i = 0; i < flags.length; i++) {
            if(flags[i] == 1) System.out.printf("%d ",i);
        }

        long end = System.currentTimeMillis();

        System.out.println();
        System.out.println(end - start);

    }
}
