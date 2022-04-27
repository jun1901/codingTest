package swexpertacademy.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem1976 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int h1, h2, m1, m2;
        int[] result = new int[2];

        for (int i = 1; i <= num ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            h1 = Integer.parseInt(st.nextToken());
            m1 = Integer.parseInt(st.nextToken());
            h2 = Integer.parseInt(st.nextToken());
            m2 = Integer.parseInt(st.nextToken());
            result[0] = h1 + h2;
            result[1] = m1 + m2;
            if(result[1] > 60) {
                result[1] -= 60;
                result[0]++;
            }
            if(result[0] > 12) result[0] -= 12;

            System.out.printf("#%d %d %d\n", i, result[0], result[1]);

        }

    }
}
