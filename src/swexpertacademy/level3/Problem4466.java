package swexpertacademy.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Problem4466 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken()),sum=0;
            Integer[] input = new Integer[n];
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) input[j] = Integer.parseInt(st.nextToken());
            Arrays.sort(input, Collections.reverseOrder());
            for (int j = 0; j < k; j++) sum += input[j];
            sb.append("#"+i+" "+sum+"\n");
        }
        System.out.print(sb);
    }
}
