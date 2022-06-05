package swexpertacademy.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem3233 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long A = Long.parseLong(st.nextToken()), B = Long.parseLong(st.nextToken()), count = 0;
            sb.append("#"+i+" "+(long)Math.pow(A/B,2)+"\n");
            /*for (long j = 0; j < A/B; j++) count += 2*j+1;
            sb.append("#"+i+" "+count+"\n");*/

        }
        System.out.print(sb);
    }
}
