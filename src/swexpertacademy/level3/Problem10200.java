package swexpertacademy.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem10200 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()), A = Integer.parseInt(st.nextToken()), B =Integer.parseInt(st.nextToken());
            sb.append("#"+i+" "+Math.min(A,B)+" "+Math.max(0,A+B-N)+"\n");
        }
        System.out.println(sb);

    }
}
