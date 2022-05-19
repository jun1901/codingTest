package swexpertacademy.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem5431 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
            boolean[] result = new boolean[n+1];
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < k; j++) result[Integer.parseInt(st.nextToken())] = true;
            sb.append("#"+i);
            for (int j = 1; j <= n; j++) if(!result[j]) sb.append(" "+j);
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
