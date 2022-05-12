package swexpertacademy.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem1284 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            /*
            int[] n = new int[st.countTokens()];
            for (int j = 0; j < n.length; j++) n[j] = Integer.parseInt(st.nextToken());
            sb.append("#"+i+" "+Math.min(n[0]*n[4],n[4]<=n[2] ? n[1]:n[1]+n[3]*(n[4]-n[2]))+"\n");
            */
            int P = Integer.parseInt(st.nextToken()), Q = Integer.parseInt(st.nextToken()),
                R = Integer.parseInt(st.nextToken()), S = Integer.parseInt(st.nextToken()), W = Integer.parseInt(st.nextToken());
            sb.append("#"+i+" "+Math.min(P*W,W<=R ? Q:Q+S*(W-R))+"\n");
        }
        System.out.print(sb);
    }
}
