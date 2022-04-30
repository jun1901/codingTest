package swexpertacademy.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem8658 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T ; i++) {
            int min = 0, max = 0, sum;
            StringTokenizer st = new StringTokenizer(br.readLine());
            String num = st.nextToken();
            for (int j = 0; j < num.length(); j++)
                min += num.charAt(j) - '0';
            max = min;
            while (st.hasMoreTokens()){
                num = st.nextToken();
                sum = 0;
                for (int j = 0; j < num.length(); j++)
                    sum += num.charAt(j) - '0';
                if(max < sum) max = sum;
                else if(min > sum) min = sum;
            }
            System.out.printf("#%d %d %d\n", i, max, min);
        }

    }
}
