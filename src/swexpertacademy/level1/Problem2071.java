package swexpertacademy.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem2071 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for (int i = 1; i <= num ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = st.countTokens();
            int result = 0;
            while (st.hasMoreTokens())
                result += Integer.parseInt(st.nextToken());
            System.out.printf("#%d %d\n", i, Math.round(result*1.0/n));
        }

    }
}
