package swexpertacademy.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem1984 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max, min, sum, n;
        int num = Integer.parseInt(br.readLine());

        for (int i = 1; i <= num ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            sum = max = min = Integer.parseInt(st.nextToken());
            while (st.hasMoreTokens()){
                n = Integer.parseInt(st.nextToken());
                sum += n;
                if (max < n) max = n;
                else if (min > n) min = n;

            }
            sum -= (min + max);
            System.out.printf("#%d %d\n", i, Math.round(sum/8.0));

        }

    }
}
