package swexpertacademy.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Problem1933 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int sqrtn = (int) Math.floor(Math.sqrt(num));

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 1; i <= sqrtn; i++) {
            if(num % i == 0){
                result.add(i);
                if(i != sqrtn) result.add(num / i);
            }
        }
        Collections.sort(result);

        result.forEach(i -> System.out.printf("%d ", i));


        /*
        for(int i=1; i<=num; i++)
            if(num%i==0)
                System.out.print(i+" ");
        */
    }




}
